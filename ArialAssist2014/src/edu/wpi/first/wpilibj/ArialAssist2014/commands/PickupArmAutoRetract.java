package edu.wpi.first.wpilibj.ArialAssist2014.commands;

public class PickupArmAutoRetract extends CommandBase
{
    
    public PickupArmAutoRetract()
    {
        super("PickupArmAutoRetract");
        
        requires(pickupArm);
    }

    protected void initialize()
    {
    }

    protected void execute()
    {
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
