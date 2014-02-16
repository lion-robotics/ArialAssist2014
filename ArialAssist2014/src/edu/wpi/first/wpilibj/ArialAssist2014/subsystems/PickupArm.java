package edu.wpi.first.wpilibj.ArialAssist2014.subsystems;

import edu.wpi.first.wpilibj.ArialAssist2014.RobotMap;
import edu.wpi.first.wpilibj.ArialAssist2014.commands.PickupArmIdle;
import edu.wpi.first.wpilibj.CounterBase;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class PickupArm extends Subsystem {
    
    Talon pickupLeft;
    Talon pickupRight;
    
    Encoder armEncoder;

    public PickupArm(){
        super("PickupArm");
        pickupLeft = new Talon(RobotMap.DIGITAL_SIDECAR, RobotMap.PICKUP_ARM_LEFT_TALON);
        pickupRight = new Talon(RobotMap.DIGITAL_SIDECAR, RobotMap.PICKUP_ARM_RIGHT_TALON);
        
        armEncoder = new Encoder(RobotMap.ARM_ENCODER_PORT_1, RobotMap.ARM_ENCODER_PORT_2, true, CounterBase.EncodingType.k4X);
        
        armEncoder.setMaxPeriod(.1);
        armEncoder.setMinRate(10);
        armEncoder.setReverseDirection(true);
        armEncoder.setDistancePerPulse(5);
        armEncoder.setSamplesToAverage(7);
        
        armEncoder.reset();
        
        armEncoder.start();
    }
    
    public void initDefaultCommand() {
        setDefaultCommand(new PickupArmIdle());
    }
    
    public void retractArm(){
        pickupLeft.set(0.65);
        pickupRight.set(0.65);
    }
    
    public void extendArm(){
        pickupLeft.set(-0.65);
        pickupRight.set(-0.65);
    }
    
     public void stopArm(){
        pickupLeft.set(0.0);
        pickupRight.set(0.0);
    }
    
    public int getCount(){
        return armEncoder.get();
    }
    
}
