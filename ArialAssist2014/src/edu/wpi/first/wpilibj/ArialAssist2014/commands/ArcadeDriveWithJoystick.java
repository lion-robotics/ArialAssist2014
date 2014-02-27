package edu.wpi.first.wpilibj.ArialAssist2014.commands;

public class ArcadeDriveWithJoystick extends CommandBase {
    
    public ArcadeDriveWithJoystick() {
        super("ArcadeDriveWithJoystick");
        requires(driveTrain);
    }

    protected void initialize() {
    }

    protected void execute() {
        driveTrain.driveArcade(oi.driverJoystick.getY(), oi.driverJoystick.getZ());
        //System.out.println("Drive Right: " + driveTrain.getCount(driveTrain.baseEncoderRight)+
               // " Drive Left: " + driveTrain.getCount(driveTrain.baseEncoderLeft));
    }

    protected boolean isFinished() {
        return false;
    }
    
    protected void end() {
    }

    protected void interrupted() {
    }
}
