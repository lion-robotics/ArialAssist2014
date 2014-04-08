package edu.wpi.first.wpilibj.ArialAssist2014.commands;

public class PickupArmExtend extends CommandBase
{
    int extendDistance = 200;
    boolean hasExtended = false;
    
    public PickupArmExtend()
    {   
        super("PickupArmExtend");
        
        requires(pickupArm);
    }
    
    protected void initialize()
    {
        pickupArm.isRetracting = true;
    }

    protected void execute()
    {
        pickupArm.extendArm();
    }

    protected boolean isFinished()
    {
        return true;
    }

    protected void end()
    {
    }

    protected void interrupted()
    {
    }
}
