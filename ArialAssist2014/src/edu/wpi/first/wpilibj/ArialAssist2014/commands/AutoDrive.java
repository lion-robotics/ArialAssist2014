/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.ArialAssist2014.commands;

/**
 *
 * @author
 * Robotics
 */
public class AutoDrive extends CommandBase
{
    double speed = 0.0;
    double direction = 0.0;
    
    public AutoDrive()
    {
        requires(driveTrain);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }
    
    public AutoDrive(double speed, double direction, double time)
    {
        this.speed = speed;
        this.direction = direction;
        setTimeout(time);
    }

    // Called just before this Command runs the first time
    protected void initialize()
    {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute()
    {
        driveTrain.driveArcade(speed, direction);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished()
    {
        return isTimedOut();
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
