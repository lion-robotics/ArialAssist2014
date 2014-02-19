package edu.wpi.first.wpilibj.ArialAssist2014.commands;

public class RunRollersBackwards extends CommandBase
{
    int time = 200;
     
    public RunRollersBackwards()
    {
        requires(pickupRoller);
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
        pickupRoller.passSlow();
        time--;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished()
    {
        return (time == 0);
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
