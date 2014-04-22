package edu.wpi.first.wpilibj.ArialAssist2014.commands;

import edu.wpi.first.wpilibj.DriverStationLCD;
import edu.wpi.first.wpilibj.camera.AxisCameraException;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class FindHotTarget extends CommandBase
{
    int frameCounter = 0;
    public FindHotTarget()
    {
        //requires(vision);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    protected void initialize()
    {
        frameCounter = 1;
    }

    protected void execute()
    {
//        try
//        {
//            
//            frameCounter--;
//            //vision.autonomous();
//            
//            
//        } catch (AxisCameraException ex)
//        {
//            ex.printStackTrace();
//        }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished()
    {
        return (frameCounter == 0);
         
    }

    // Called once after isFinished returns true
    protected void end()
    {
//        SmartDashboard.putBoolean("isHot", vision.isHot);
//        SmartDashboard.putNumber("Targets", vision.numberOfTargets);
//        SmartDashboard.putNumber("Horizontal", vision.numHorizontal);
//        DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser1, 1, " " + vision.isHot);
//        DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser2, 1, " " + vision.numberOfTargets);
//        System.out.println(vision.isHot);
//        System.out.println(vision.numberOfTargets);
//        
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted()
    {
    }
}
