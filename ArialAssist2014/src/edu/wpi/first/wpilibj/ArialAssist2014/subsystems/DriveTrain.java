/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.ArialAssist2014.subsystems;

import edu.wpi.first.wpilibj.ArialAssist2014.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.ArialAssist2014.commands.ArcadeDriveWithJoystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Solenoid;

/**
 *
 * @author Jonathan
 */
public class DriveTrain extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    Talon frontLeftTalon;
    Talon rearLeftTalon;
    Talon frontRightTalon;
    Talon rearRightTalon;

    RobotDrive robotDrive;

    Solenoid leftTransmissionSolenoid;
    Solenoid rightTransmissionSolenoid;

    public DriveTrain() {
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

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new ArcadeDriveWithJoystick());
    }
}
