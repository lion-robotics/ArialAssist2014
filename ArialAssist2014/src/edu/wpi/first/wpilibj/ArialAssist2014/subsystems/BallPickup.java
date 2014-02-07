package edu.wpi.first.wpilibj.ArialAssist2014.subsystems;

import edu.wpi.first.wpilibj.ArialAssist2014.RobotMap;
import edu.wpi.first.wpilibj.ArialAssist2014.commands.PickUp;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class BallPickup extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    //Talon pickUpTalon;

    public BallPickup(){
        super("BallPickup");
        //pickUpTalon = new Talon(RobotMap.DIGITAL_SIDECAR, RobotMap.LEFT_TWO_SHOOTER_TALON);
    }
    public void initDefaultCommand() {
        //setDefaultCommand(new PickUp());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
