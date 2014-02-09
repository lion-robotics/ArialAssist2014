package edu.wpi.first.wpilibj.ArialAssist2014.commands;

public class PickupRollerIdle extends CommandBase {
    
    public PickupRollerIdle() {
        super("PickupRollerIdle");
        
        requires(pickupRoller);
    }

    protected void initialize() {
    }

    protected void execute() {
        pickupRoller.stopRoller();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
