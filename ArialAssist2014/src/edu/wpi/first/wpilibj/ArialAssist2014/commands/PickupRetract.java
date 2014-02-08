package edu.wpi.first.wpilibj.ArialAssist2014.commands;


public class PickupRetract extends CommandBase
{
    
    public PickupRetract()
    {
        requires(ballPickup);
    }

    protected void initialize()
    {
    }

    protected void execute()
    {
        ballPickup.retractArm();
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
