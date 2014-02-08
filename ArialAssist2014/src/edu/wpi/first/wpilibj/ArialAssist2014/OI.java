package edu.wpi.first.wpilibj.ArialAssist2014;

import edu.wpi.first.wpilibj.ArialAssist2014.commands.PickupAutoRetract;
import edu.wpi.first.wpilibj.ArialAssist2014.commands.PickupExtend;
import edu.wpi.first.wpilibj.ArialAssist2014.commands.PickupPass;
import edu.wpi.first.wpilibj.ArialAssist2014.commands.PickupPull;
import edu.wpi.first.wpilibj.ArialAssist2014.commands.PickupRetract;
import edu.wpi.first.wpilibj.ArialAssist2014.commands.ShiftTransmission;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    
    public Joystick driverJoystick = new Joystick(1);
    public Joystick shooterJoystick = new Joystick(2);
    
    public Button hiTransmission = 
            new JoystickButton(driverJoystick, RobotMap.TRANSMISSION_HI_BUTTON);
   
    public Button lowTransmission = 
            new JoystickButton(driverJoystick, RobotMap.TRANSMISSION_LOW_BUTTON);
    
    public Button shootButton =
            new JoystickButton(driverJoystick, RobotMap.SHOOT_BUTTON);
    
    public Button extend =
            new JoystickButton(shooterJoystick, RobotMap.EXTEND_UP_BUTTON);
    
    public Button retract =
            new JoystickButton(shooterJoystick, RobotMap.RETRACT_BUTTON);
    
    public Button autoRetract =
            new JoystickButton(shooterJoystick, RobotMap.AUTO_RETRACT);
   
    public Button pullRoller =
            new JoystickButton(shooterJoystick, RobotMap.PULL_ROLLER);
    
    public Button passRoller =
            new JoystickButton(shooterJoystick, RobotMap.PASS_ROLLER);
    
    public OI(){
        hiTransmission.whenPressed(new ShiftTransmission(true));
        
        lowTransmission.whenPressed(new ShiftTransmission(false));
        
        extend.whileHeld(new PickupExtend());
        
        retract.whileHeld(new PickupRetract());
        
        autoRetract.whileHeld(new PickupAutoRetract());
        
        pullRoller.whileHeld(new PickupPull());
        
        passRoller.whileHeld(new PickupPass());
        
    }

    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}

