package edu.wpi.first.wpilibj.ArialAssist2014.commands;

public class PickupExtend extends CommandBase
{
    
    public PickupExtend()
    {   
        requires(ballPickup);
    }
    
    protected void initialize()
    {
    }

    protected void execute()
    {
        ballPickup.extendArm();
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
