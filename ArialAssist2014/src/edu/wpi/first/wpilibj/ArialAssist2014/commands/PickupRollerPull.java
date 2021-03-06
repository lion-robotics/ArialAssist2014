package edu.wpi.first.wpilibj.ArialAssist2014.commands;

public class PickupRollerPull extends CommandBase
{

    public PickupRollerPull()
    {
        super("PickupRollerPull");

        requires(pickupRoller);
    }

    protected void initialize()
    {
    }

    protected void execute()
    {
        if (pickupArm.isRetracting)
        {
            pickupRoller.slowIn();
        } else
        {
            pickupRoller.pullIn();
        }

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
