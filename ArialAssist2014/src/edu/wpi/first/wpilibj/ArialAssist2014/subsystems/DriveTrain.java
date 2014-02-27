package edu.wpi.first.wpilibj.ArialAssist2014.subsystems;

import edu.wpi.first.wpilibj.ArialAssist2014.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.ArialAssist2014.commands.ArcadeDriveWithJoystick;
import edu.wpi.first.wpilibj.CounterBase;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Solenoid;

public class DriveTrain extends Subsystem {
    Talon frontLeftTalon;
    Talon rearLeftTalon;
    Talon frontRightTalon;
    Talon rearRightTalon;

    RobotDrive robotDrive;
    
    public Encoder baseEncoderLeft;
    public Encoder baseEncoderRight;

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
        
        baseEncoderRight = new Encoder(RobotMap.BASE_ENCODER_RIGHT_PORT_1, RobotMap.BASE_ENCODER_RIGHT_PORT_2, true, CounterBase.EncodingType.k4X);
        baseEncoderLeft = new Encoder(RobotMap.BASE_ENCODER_LEFT_PORT_1, RobotMap.BASE_ENCODER_LEFT_PORT_2, true, CounterBase.EncodingType.k4X);
        
        baseEncoderRight.setMaxPeriod(.1);
        baseEncoderRight.setMinRate(10);
        baseEncoderRight.setReverseDirection(true);
        baseEncoderRight.setDistancePerPulse(5);
        baseEncoderRight.setSamplesToAverage(7);
        baseEncoderRight.reset();
        baseEncoderRight.start();
        
        baseEncoderLeft.setMaxPeriod(.1);
        baseEncoderLeft.setMinRate(10);
        baseEncoderLeft.setReverseDirection(true);
        baseEncoderLeft.setDistancePerPulse(5);
        baseEncoderLeft.setSamplesToAverage(7);
        baseEncoderLeft.reset();
        baseEncoderLeft.start();
        
        leftTransmissionOne = new Solenoid(RobotMap.TRANSMISSION_SOLENOID_ONE);
        rightTransmissionOne = new Solenoid(RobotMap.TRANSMISSION_SOLENOID_TWO);
        
        // Sets the default transmission speed.
        leftTransmissionOne.set(true);
        rightTransmissionOne.set(false);
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
        
        rightTransmissionOne.set(isHiSpeed);
    }
    
    public int getCount(Encoder e){
        return e.get();
    }
    
    
    public int getRawCount(Encoder e){
        return e.getRaw();
    }
    
    public double getDistance(Encoder e){
        return e.getDistance();
    }
    
    public double getRate(Encoder e){
        return e.getRate();
    }
    
    public boolean getDirection(Encoder e){
        return e.getDirection();
    }
    
    public boolean getStopped(Encoder e){
        return e.getStopped();
    }
    
    public void resetEncoder(Encoder e){
        e.reset();
    }
    
    public void stopEncoder(Encoder e){
        e.stop();
    }
    
    public void startEncoder(Encoder e){
        e.start();
    }
    
    
    public void initDefaultCommand() {
        setDefaultCommand(new ArcadeDriveWithJoystick());
    }
}
