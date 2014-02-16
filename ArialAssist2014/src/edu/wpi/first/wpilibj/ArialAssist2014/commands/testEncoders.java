package edu.wpi.first.wpilibj.ArialAssist2014.commands;

public class testEncoders extends CommandBase
{
    
    public testEncoders()
    {
        requires(shooter);
    }

    protected void initialize()
    {
        shooter.resetEncoder();
        shooter.startEncoder();
    }

    protected void execute()
    {
        System.out.println("Encoder Count: " + shooter.getCount());
    }
    
    protected boolean isFinished()
    {
        return false;
    }

    protected void end()
    {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted()
    {
    }
}
