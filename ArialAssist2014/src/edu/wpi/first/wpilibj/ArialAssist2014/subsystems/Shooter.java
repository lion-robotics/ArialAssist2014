package edu.wpi.first.wpilibj.ArialAssist2014.subsystems;

import edu.wpi.first.wpilibj.ArialAssist2014.RobotMap;
import edu.wpi.first.wpilibj.ArialAssist2014.commands.IdleShoot;
import edu.wpi.first.wpilibj.ArialAssist2014.commands.testIdle;
import edu.wpi.first.wpilibj.ArialAssist2014.commands.RetractWithoutEncoder;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem {

    Talon leftTalonOne;
    Talon rightTalonOne;
    
    Encoder driveEncoder;
    
    public Shooter(){
        super("Shooter");
        
        leftTalonOne = new Talon(RobotMap.DIGITAL_SIDECAR, RobotMap.SHOOTER_TALON_ONE);
        rightTalonOne = new Talon(RobotMap.DIGITAL_SIDECAR, RobotMap.SHOOTER_TALON_TWO);
        
        driveEncoder = new Encoder(RobotMap.DRIVE_ENCODER_PORT_1, RobotMap.DRIVE_ENCODER_PORT_2, true, EncodingType.k4X);
        
        driveEncoder.setMaxPeriod(.1);
        driveEncoder.setMinRate(10);
        driveEncoder.setReverseDirection(true);
        driveEncoder.setDistancePerPulse(5);
        driveEncoder.setSamplesToAverage(7);
        
        resetEncoder();
        
        startEncoder();
        
       
       
    }
    public void initDefaultCommand() { 
        setDefaultCommand(new IdleShoot());
      
    }
    
    public void shootBall(){
        leftTalonOne.set(-1);
        rightTalonOne.set(-1);
    }
    
    public void idleShooter(){
        leftTalonOne.stopMotor();
        rightTalonOne.stopMotor();
    }
    
    public void retractShooter(){
        leftTalonOne.set(.1);
        rightTalonOne.set(.1);
    }
    
    public int getCount(){
        return driveEncoder.get();
    }
    
    public int getRawCount(){
        return driveEncoder.getRaw();
    }
    
    public double getDistance(){
        return driveEncoder.getDistance();
    }
    
    public double getRate(){
        return driveEncoder.getRate();
    }
    
    public boolean getDirection(){
        return driveEncoder.getDirection();
    }
    
    public boolean getStopped(){
        return driveEncoder.getStopped();
    }
    
    public void resetEncoder(){
        driveEncoder.reset();
    }
    
    public void stopEncoder(){
        driveEncoder.stop();
    }
    
    public void startEncoder(){
        driveEncoder.start();
    }
    
    public void passShot()
    {
        leftTalonOne.set(.5);
        rightTalonOne.set(.5);
    }
    
    public void trussShot(){
        leftTalonOne.set(1);
        rightTalonOne.set(1);
    }
}
