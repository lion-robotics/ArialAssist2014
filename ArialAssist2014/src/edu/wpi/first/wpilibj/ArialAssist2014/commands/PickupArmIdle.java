package edu.wpi.first.wpilibj.ArialAssist2014.commands;

public class PickupArmIdle extends CommandBase
{
    
    public PickupArmIdle()
    {
        super("PickupArmIdle");
        
        requires(pickupArm);
    }

    protected void initialize()
    {
    }

    protected void execute()
    {
        pickupArm.stopArm();
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
