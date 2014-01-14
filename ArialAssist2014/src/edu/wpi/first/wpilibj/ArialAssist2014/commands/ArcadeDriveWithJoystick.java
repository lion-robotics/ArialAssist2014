package edu.wpi.first.wpilibj.ArialAssist2014.commands;

public class ArcadeDriveWithJoystick extends CommandBase {
    
    public ArcadeDriveWithJoystick() {
        super("ArcadeDriveWithJoystick");
        requires(driveTrain);
    }

    protected void initialize() {
    }

    protected void execute() {
        driveTrain.driveArcade(oi.driverJoystick.getX(), oi.driverJoystick.getZ());
    }

    protected boolean isFinished() {
        return false;
    }
    
    protected void end() {
    }

    protected void interrupted() {
    }
}
