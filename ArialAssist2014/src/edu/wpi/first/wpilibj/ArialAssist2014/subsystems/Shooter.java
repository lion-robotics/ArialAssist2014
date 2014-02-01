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
        
        leftTalonOne = new Talon(RobotMap.DIGITAL_SIDECAR, RobotMap.LEFT_ONE_SHOOTER_TALON);
        leftTalonTwo = new Talon(RobotMap.DIGITAL_SIDECAR, RobotMap.LEFT_TWO_SHOOTER_TALON);
        rightTalonOne = new Talon(RobotMap.DIGITAL_SIDECAR, RobotMap.RIGHT_ONE_SHOOTER_TALON);
        rightTalonTwo = new Talon(RobotMap.DIGITAL_SIDECAR, RobotMap.RIGHT_TWO_SHOOTER_TALON);
    }
    public void initDefaultCommand() { 
        setDefaultCommand(new IdleShoot());
    }
}
