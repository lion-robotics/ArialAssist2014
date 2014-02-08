package edu.wpi.first.wpilibj.ArialAssist2014.subsystems;

import edu.wpi.first.wpilibj.ArialAssist2014.RobotMap;
import edu.wpi.first.wpilibj.ArialAssist2014.commands.IdlePickup;
import edu.wpi.first.wpilibj.ArialAssist2014.commands.PickupIdle;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class BallPickup extends Subsystem {
    
    Talon pickupLeft;
    Talon pickupRight;
    Talon roller;

    public BallPickup(){
        super("BallPickup");
        pickupLeft = new Talon(RobotMap.DIGITAL_SIDECAR, RobotMap.PICKUP_TALON_LEFT);
        pickupRight = new Talon(RobotMap.DIGITAL_SIDECAR, RobotMap.PICKUP_TALON_RIGHT);
    }
    public void initDefaultCommand() {
        setDefaultCommand(new IdlePickup());
    }
    public void retractArm(){
        pickupLeft.set(0.7);
        pickupRight.set(0.7);
    }
    public void extendArm(){
        pickupLeft.set(-0.7);
        pickupRight.set(-0.7);
    }
     public void stopArm(){
        pickupLeft.set(0.0);
        pickupRight.set(0.0);
    }
    public void pullIn(){
        roller.set(0.7);
    }
    public void pass(){
       roller.set(-.7);
    }
    
    public void rollerStop(){
        roller.set(0.0);
    }
    
}
