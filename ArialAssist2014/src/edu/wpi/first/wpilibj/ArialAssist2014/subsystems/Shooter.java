package edu.wpi.first.wpilibj.ArialAssist2014.subsystems;

import edu.wpi.first.wpilibj.ArialAssist2014.RobotMap;
import edu.wpi.first.wpilibj.ArialAssist2014.commands.IdleShoot;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem {

    Talon leftTalonOne;
    
    
    Talon rightTalonOne;
    
    
    public Shooter(){
        super("Shooter");
        
        leftTalonOne = new Talon(RobotMap.DIGITAL_SIDECAR, RobotMap.SHOOTER_TALON_ONE);
       
        rightTalonOne = new Talon(RobotMap.DIGITAL_SIDECAR, RobotMap.SHOOTER_TALON_TWO);
       
    }
    public void initDefaultCommand() { 
        setDefaultCommand(new IdleShoot());
    }
}
