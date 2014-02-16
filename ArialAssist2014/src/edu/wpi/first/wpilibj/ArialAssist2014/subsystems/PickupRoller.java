package edu.wpi.first.wpilibj.ArialAssist2014.subsystems;

import edu.wpi.first.wpilibj.ArialAssist2014.RobotMap;
import edu.wpi.first.wpilibj.ArialAssist2014.commands.PickupRollerIdle;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class PickupRoller extends Subsystem {

    Talon rollerOne;
    Talon rollerTwo;
    
    public PickupRoller(){
        super("PickupRoller");
        
        rollerOne = new Talon(RobotMap.DIGITAL_SIDECAR, RobotMap.PICKUP_ROLLER_ONE_TALON);
         
    }
    
    public void initDefaultCommand() {
        setDefaultCommand(new PickupRollerIdle());
    }
    
    public void pullIn(){
        rollerOne.set(1);
       
    }
    public void pass(){
       rollerOne.set(-1);
       
    }
    
    public void stopRoller(){
        rollerOne.stopMotor();
        
    }
}
