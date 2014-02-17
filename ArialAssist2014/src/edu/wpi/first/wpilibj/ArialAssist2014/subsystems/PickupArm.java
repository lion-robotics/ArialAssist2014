package edu.wpi.first.wpilibj.ArialAssist2014.subsystems;

import edu.wpi.first.wpilibj.ArialAssist2014.RobotMap;
import edu.wpi.first.wpilibj.CounterBase;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class PickupArm extends Subsystem {
    
    Solenoid ArmOne;
    Solenoid ArmTwo;

    public PickupArm(){
        super("PickupArm");
        
        ArmOne = new Solenoid(RobotMap.ARM_SOLENOID_ONE);
        ArmTwo = new Solenoid(RobotMap.ARM_SOLENOID_TWO);
        
        ArmOne.set(true);
        ArmTwo.set(false);
    }
    
    public void initDefaultCommand() {
    }
    
    public void retractArm(){
       ArmOne.set(true);
       ArmTwo.set(false);
    }
    
    public void extendArm(){
       ArmOne.set(false);
       ArmTwo.set(true);
    }
    
}
