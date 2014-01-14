package edu.wpi.first.wpilibj.ArialAssist2014.subsystems;

import edu.wpi.first.wpilibj.ArialAssist2014.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.ArialAssist2014.commands.ArcadeDriveWithJoystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Solenoid;

public class DriveTrain extends Subsystem {
    Talon frontLeftTalon;
    Talon rearLeftTalon;
    Talon frontRightTalon;
    Talon rearRightTalon;

    RobotDrive robotDrive;

    boolean isHiSpeed = true;
    
    Solenoid leftTransmissionSolenoid;
    Solenoid rightTransmissionSolenoid;

    public DriveTrain() {
        super("DriveTrain");
        
        frontLeftTalon = new Talon(RobotMap.FRONT_LEFT_DRIVE_TALON);
        rearLeftTalon = new Talon(RobotMap.REAR_LEFT_DRIVE_TAlON);
        frontRightTalon = new Talon(RobotMap.FRONT_LEFT_DRIVE_TALON);
        rearRightTalon = new Talon(RobotMap.REAR_RIGHT_DRIVE_TALON);

        robotDrive = new RobotDrive(frontLeftTalon, rearLeftTalon, frontRightTalon, rearRightTalon);

        leftTransmissionSolenoid = new Solenoid(RobotMap.LEFT_TRANSMISSION_SOLENOID);
        rightTransmissionSolenoid = new Solenoid(RobotMap.RIGHT_TRANSMISSION_SOLENOID);
    }

    public void driveArcade(double moveValue, double rotationValue) {
        robotDrive.arcadeDrive(moveValue, rotationValue);
    }

    public void driveTank(float leftSpeed, float rightSpeed) {
        robotDrive.tankDrive(leftSpeed, rightSpeed);
    }
    
    public boolean getHiSpeed()
    {
        return isHiSpeed;
    }
    
    public void setHiSpeed(boolean hiSpeed)
    {
        isHiSpeed = hiSpeed;
        
        leftTransmissionSolenoid.set(isHiSpeed);
        rightTransmissionSolenoid.set(isHiSpeed);
    }

    public void initDefaultCommand() {
        setDefaultCommand(new ArcadeDriveWithJoystick());
    }
}
