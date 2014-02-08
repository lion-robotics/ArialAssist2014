package edu.wpi.first.wpilibj.ArialAssist2014.commands;

public class PickupPass extends CommandBase
{
    
    public PickupPass()
    {
    }

    protected void initialize()
    {
    }

    protected void execute()
    {
        ballPickup.pass();
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
