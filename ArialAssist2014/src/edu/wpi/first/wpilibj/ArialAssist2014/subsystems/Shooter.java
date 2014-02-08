package edu.wpi.first.wpilibj.ArialAssist2014.subsystems;

import edu.wpi.first.wpilibj.ArialAssist2014.RobotMap;
import edu.wpi.first.wpilibj.ArialAssist2014.commands.IdleShoot;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem {

    Talon leftTalonOne;
    Talon leftTalonTwo;
    
    Talon rightTalonOne;
    Talon rightTalonTwo;
    
    public Shooter(){
        super("Shooter");
        
        leftTalonOne = new Talon(RobotMap.DIGITAL_SIDECAR, RobotMap.SHOOTER_TALON_ONE);
        leftTalonTwo = new Talon(RobotMap.DIGITAL_SIDECAR, RobotMap.PICKUP_TALON_LEFT);
        rightTalonOne = new Talon(RobotMap.DIGITAL_SIDECAR, RobotMap.SHOOTER_TALON_TWO);
        rightTalonTwo = new Talon(RobotMap.DIGITAL_SIDECAR, RobotMap.PICKUP_TALON_RIGHT);
    }
    public void initDefaultCommand() { 
        setDefaultCommand(new IdleShoot());
    }
}
