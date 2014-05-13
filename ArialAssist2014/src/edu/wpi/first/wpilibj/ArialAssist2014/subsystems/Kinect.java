/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.ArialAssist2014.subsystems;

import com.sun.squawk.util.MathUtils;
import edu.wpi.first.wpilibj.ArialAssist2014.commands.CommandBase;
import edu.wpi.first.wpilibj.Skeleton;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author
 * Robotics
 */
public class Kinect extends Subsystem
{
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    //Constants which define the valid arm positions
    static final int ARM_MAX_ANGLE = 105;
    static final int ARM_MIN_ANGLE = 0;
    static final double Z_PLANE_TOLERANCE = 0.3;    /* In meters */

    //Constants which define the "trigger" angles for the various buttons
    static final int LEG_FORWARD = -110;
    static final int LEG_BACKWARD = -80;
    static final int LEG_OUT = -75;
    static final int HEAD_LEFT = 98;
    static final int HEAD_RIGHT = 82;
    
    public boolean hot = false;
    
     edu.wpi.first.wpilibj.Kinect kinect;
     
    public Kinect(){
         kinect = edu.wpi.first.wpilibj.Kinect.getInstance();
    }

    public void initDefaultCommand()
    {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void processMotion(){
        
        double leftAxis = 0;
        double rightAxis = 0;
        double leftAngle, rightAngle, headAngle, rightLegAngle, leftLegAngle, rightLegYZ, leftLegYZ;
        boolean dataWithinExpectedRange;
        boolean[] buttons = new boolean[8];
        hot = false;
        
        
        if (kinect.getSkeleton().GetTrackState() == Skeleton.tTrackState.kTracked) {

                /* Determine angle of each arm and map to range -1,1 */
                leftAngle = AngleXY(kinect.getSkeleton().GetShoulderLeft(), kinect.getSkeleton().GetWristLeft(), true);
                rightAngle = AngleXY(kinect.getSkeleton().GetShoulderRight(), kinect.getSkeleton().GetWristRight(), false);
                leftAxis = CoerceToRange(leftAngle, -70, 70, -1, 1);
                rightAxis = CoerceToRange(rightAngle, -70, 70, -1, 1);

                
                /* Check if arms are within valid range and at approximately the same z-value */
                dataWithinExpectedRange = leftAngle < ARM_MAX_ANGLE && leftAngle > ARM_MIN_ANGLE &&
                                      rightAngle < ARM_MAX_ANGLE && rightAngle > ARM_MIN_ANGLE;
                dataWithinExpectedRange = dataWithinExpectedRange &&
                                      InSameZPlane(kinect.getSkeleton().GetShoulderLeft(),
                                                   kinect.getSkeleton().GetWristLeft(),
                                                   Z_PLANE_TOLERANCE) &&
                                      InSameZPlane(kinect.getSkeleton().GetShoulderRight(),
                                                   kinect.getSkeleton().GetWristRight(),
                                                   Z_PLANE_TOLERANCE);

                

                if (dataWithinExpectedRange){
                    hot = true;
                    System.out.println("Found Target: " + rightAngle);
                   
                }
                else{
                    hot = false;
                    System.out.println("Did Not Find Target: " + rightAngle);
                }
            }
            else{
                hot = false;
            }
        
    }
    
    public double AngleXY(Skeleton.Joint origin, Skeleton.Joint measured, boolean mirrored){
        return Math.toDegrees(MathUtils.atan2(measured.getY()- origin.getY(),
                (mirrored) ? (origin.getX() - measured.getX()) : (measured.getX() - origin.getX())));
    }

     
    public double AngleYZ(Skeleton.Joint origin, Skeleton.Joint measured, boolean mirrored){
        return Math.toDegrees(MathUtils.atan2(measured.getY()- origin.getY(),
                (mirrored) ? (origin.getZ() - measured.getZ()) : (measured.getZ() - origin.getZ())));
    }

    public boolean InSameZPlane(Skeleton.Joint origin, Skeleton.Joint measured, double tolerance)
        {
            return Math.abs(measured.getZ() - origin.getZ()) < tolerance;
        }

    public double CoerceToRange(double input, double inputMin, double inputMax, double outputMin, double outputMax)
        {
            /* Determine the center of the input range and output range */
            double inputCenter = Math.abs(inputMax - inputMin) / 2 + inputMin;
            double outputCenter = Math.abs(outputMax - outputMin) / 2 + outputMin;

            /* Scale the input range to the output range */
            double scale = (outputMax - outputMin) / (inputMax - inputMin);

            /* Apply the transformation */
            double result = (input + -inputCenter) * scale + outputCenter;

            /* Constrain to the output range */
            return Math.max(Math.min(result, outputMax), outputMin);
        }
    
    
}
