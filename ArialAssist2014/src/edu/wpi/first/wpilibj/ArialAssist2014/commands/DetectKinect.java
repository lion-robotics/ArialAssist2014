/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.ArialAssist2014.commands;

import edu.wpi.first.wpilibj.ArialAssist2014.subsystems.Kinect;

/**
 *
 * @author
 * Robotics
 */
public class DetectKinect extends CommandBase
{
    
    public DetectKinect()
    {
        requires(kinect);
        
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize()
    {
         
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute()
    {
        kinect.processMotion();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished()
    {
        //System.out.println(kinect.hot);
        
        return true;
    }

    // Called once after isFinished returns true
    protected void end()
    {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted()
    {
    }
}
