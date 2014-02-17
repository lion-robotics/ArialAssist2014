package edu.wpi.first.wpilibj.ArialAssist2014.commands;


public class PickupArmRetract extends CommandBase
{
   
    
    public PickupArmRetract()
    {
        super("PickupArmRetract");
        
        requires(pickupArm);
    }

    protected void initialize()
    {
    }

    protected void execute()
    {
        pickupArm.retractArm();
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
