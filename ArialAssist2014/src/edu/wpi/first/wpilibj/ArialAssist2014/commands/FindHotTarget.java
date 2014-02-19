package edu.wpi.first.wpilibj.ArialAssist2014.commands;

import edu.wpi.first.wpilibj.camera.AxisCameraException;

public class FindHotTarget extends CommandBase
{
    int frameCounter = 0;
    public FindHotTarget()
    {
        requires(vision);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    protected void initialize()
    {
        frameCounter = 2;
    }

    protected void execute()
    {
        try
        {
            frameCounter--;
            vision.autonomous();
        } catch (AxisCameraException ex)
        {
            ex.printStackTrace();
        }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished()
    {
        return (frameCounter == 0);
         
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
