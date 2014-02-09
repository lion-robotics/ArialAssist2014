package edu.wpi.first.wpilibj.ArialAssist2014.commands;

public class PickupRollerPass extends CommandBase
{
    
    public PickupRollerPass(){
        super("PickupRollerPass");
        requires(pickupRoller);
    }

    protected void initialize()
    {
    }

    protected void execute()
    {
        pickupRoller.pass();
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
