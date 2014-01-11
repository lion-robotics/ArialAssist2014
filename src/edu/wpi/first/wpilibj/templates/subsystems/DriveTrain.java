/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.commands.DriveWithJoysticks;

/**
 *
 * @author forbesje
 */
public class DriveTrain extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    RobotDrive drive;
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveWithJoysticks());
    }
    
    public void drive(double x, double y, double twist)
    {       
        drive.mecanumDrive_Cartesian(-x, y, twist, 0);
        //System.out.println("stickX=" + stickX + " stickY=" + stickY + " twist=" + stickZ);
    }
    
    /*public void autoCommand(){
        
            theShooter.autoFeedPrime();
            theShooter.setShooter(.8);
            Timer.delay(4.3); //wait to spin up
            for (int i = 0; i < 3; i++)
            {
                theShooter.feedOne();
                Timer.delay(2);
            }
            theShooter.setShooter(0);

            driveStraight(-0.75, 0.6);
            Timer.delay(0.5);
            driveTwist(0.5, 1.25);
    }*/
}