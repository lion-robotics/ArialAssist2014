package edu.wpi.first.wpilibj.ArialAssist2014.commands;

public class PickupArmExtend extends CommandBase
{
    
    public PickupArmExtend()
    {   
        super("PickupArmExtend");
        
        requires(pickupArm);
    }
    
    protected void initialize()
    {
    }

    protected void execute()
    {
        pickupArm.extendArm();
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
