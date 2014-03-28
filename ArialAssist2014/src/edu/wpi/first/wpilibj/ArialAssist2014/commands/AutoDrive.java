package edu.wpi.first.wpilibj.ArialAssist2014.commands;

import edu.wpi.first.wpilibj.Dashboard;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class AutoDrive extends CommandBase
{
    float speed = 0;
    double startTime = 0;
    double direction = 0.0;
    double time = 0;
    double distance = 0;
    static double adjustRange = 18; // inches
    static double adjustFactor = adjustRange / 50;
    
    private double isDriven;   
//    boolean hasDriven = false;
    
    public AutoDrive()
    {
        requires(driveTrain);
    }
    
    public AutoDrive(float speed, double direction, double inches)
    {
        this.speed = speed;
        this.direction = direction;
        this.time = time;
        distance = inches;
        
        //setTimeout(time);
    }

    protected void initialize()
    {
        
         // SmartDashboard.putBoolean("LED 1", true);
        
        if(SmartDashboard.getBoolean("Checkbox 1")){
            double adjust = (SmartDashboard.getNumber("Slider 1") - 50) * adjustFactor;
            isDriven = driveTrain.convertToInches(distance + adjust);
        }else{
            isDriven = driveTrain.convertToInches(distance);
        }
        
          //Left: 17260 Right: -14819
          //Left: 17382 Right: -22076
          //Left: 17488 Right: -31
          //Inches: 129   Left: 17352 Right: -21089
          //Left: 17420 Right: -629
        driveTrain.resetEncoder();
       
        driveTrain.startEncoder();

//        hasDriven = false;
      
       // setTimeout(time);  
       
    }

    protected void execute()
    {
        
//        if(driveTrain.getCount(driveTrain.baseEncoderLeft) < isDriven || 
//                driveTrain.getCount(driveTrain.baseEncoderLeft) < isDriven){
            driveTrain.driveArcade(speed, direction);
            
//        }else{
//            driveTrain.driveArcade(0, 0);
//            hasDriven = true;
//        }
        
    }

    protected boolean isFinished()
    {
        //return isTimedOut();
        return driveTrain.getCount(driveTrain.baseEncoderLeft) > isDriven;
    }

    protected void end()
    {
        System.out.println("Left: " + driveTrain.getCount(driveTrain.baseEncoderLeft) + " Right: "
                + driveTrain.getCount(driveTrain.baseEncoderRight));
        //SmartDashboard.putBoolean("LED 1", false);
    }

    protected void interrupted()
    {
    }
}
