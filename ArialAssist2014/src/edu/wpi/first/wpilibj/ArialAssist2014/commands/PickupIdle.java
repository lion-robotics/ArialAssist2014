package edu.wpi.first.wpilibj.ArialAssist2014.commands;

public class PickupIdle extends CommandBase
{
    
    public PickupIdle()
    {
        requires(ballPickup);
    }

    protected void initialize()
    {
    }

    protected void execute()
    {
        ballPickup.stopArm();
    }

    protected boolean isFinished()
    {
        return false;
    }

    protected void end()
    {
    }
    
    protected void interrupted()
    {
    }
}
