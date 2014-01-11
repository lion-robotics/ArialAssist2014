/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.idleLifters;

/**
 *
 * @author austin2
 */
public class Lifters extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    long _loopCount=0;
    
    DigitalInput _topSwitch;
    DigitalInput _botSwitch;
    Jaguar _liftMotor;
    Joystick _stick;
    int _upButton;
    int _downButton;
    String _side;
    
   public Lifters(int jagId, String side, int topSwitchId, int botSwitchId)
    {
        
        _upButton = RobotMap.RT_BUT_LIFTER_UP;
        _downButton = RobotMap.RT_BUT_LIFTER_DOWN;
        _liftMotor = new Jaguar(jagId);
        _topSwitch = new DigitalInput(1, topSwitchId);
        _botSwitch = new DigitalInput(1, botSwitchId);
        _side = side;

    }
    
    public void idle(){
        _liftMotor.set(0);
    }
    
    public void up(){
        _liftMotor.set(1);
    }
    
    public void down(){
        _liftMotor.set(-1);
    }
    
    public boolean triggeredUp(){
        if(_topSwitch.get())
        {
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean triggeredDown(){
        if(_botSwitch.get())
        {
            return true;
        }
        else{
            return false;
        }
    }

    public void initDefaultCommand() {
        setDefaultCommand(new idleLifters());
    }
}
