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
    
    Solenoid leftTransmissionOne;
    Solenoid leftTransmissionTwo;
    Solenoid rightTransmissionOne;
    Solenoid rightTransmissionTwo;

    public DriveTrain() {
        super("DriveTrain");
        
        frontLeftTalon = new Talon(RobotMap.DIGITAL_SIDECAR, RobotMap.FRONT_LEFT_DRIVE_TALON);
        rearLeftTalon = new Talon(RobotMap.DIGITAL_SIDECAR, RobotMap.REAR_LEFT_DRIVE_TAlON);
        frontRightTalon = new Talon(RobotMap.DIGITAL_SIDECAR, RobotMap.FRONT_RIGHT_DRIVE_TALON);
        rearRightTalon = new Talon(RobotMap.DIGITAL_SIDECAR, RobotMap.REAR_RIGHT_DRIVE_TALON);

        robotDrive = new RobotDrive(frontLeftTalon, rearLeftTalon, frontRightTalon, rearRightTalon);

        leftTransmissionOne = new Solenoid(RobotMap.LEFT_TRANSMISSION_SOLENOID_ONE);
        leftTransmissionTwo = new Solenoid(RobotMap.LEFT_TRANSMISSION_SOLENOID_TWO);
        rightTransmissionOne = new Solenoid(RobotMap.RIGHT_TRANSMISSION_SOLENOID_ONE);
        rightTransmissionTwo = new Solenoid(RobotMap.RIGHT_TRANSMISSION_SOLENOID_TWO);
        
        // Sets the default transmission speed.
        leftTransmissionOne.set(true);
        leftTransmissionTwo.set(false);
        
        rightTransmissionOne.set(true);
        rightTransmissionTwo.set(false);
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
        
        leftTransmissionOne.set(!isHiSpeed);
        leftTransmissionTwo.set(isHiSpeed);
        
        rightTransmissionOne.set(!isHiSpeed);
        rightTransmissionTwo.set(isHiSpeed);
    }
    
    public void initDefaultCommand() {
        setDefaultCommand(new ArcadeDriveWithJoystick());
    }
}
