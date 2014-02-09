package edu.wpi.first.wpilibj.ArialAssist2014.subsystems;

import edu.wpi.first.wpilibj.ArialAssist2014.RobotMap;
import edu.wpi.first.wpilibj.ArialAssist2014.commands.PickupArmIdle;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class PickupArm extends Subsystem {
    
    Talon pickupLeft;
    Talon pickupRight;

    public PickupArm(){
        super("PickupArm");
        pickupLeft = new Talon(RobotMap.DIGITAL_SIDECAR, RobotMap.PICKUP_ARM_LEFT_TALON);
        pickupRight = new Talon(RobotMap.DIGITAL_SIDECAR, RobotMap.PICKUP_ARM_RIGHT_TALON);
    }
    
    public void initDefaultCommand() {
        setDefaultCommand(new PickupArmIdle());
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
    
}
