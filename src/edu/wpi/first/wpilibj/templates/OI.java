
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.templates.commands.FeederPrime;
import edu.wpi.first.wpilibj.templates.commands.LiftLeft;
import edu.wpi.first.wpilibj.templates.commands.LiftRight;
import edu.wpi.first.wpilibj.templates.commands.LiftShooter;
import edu.wpi.first.wpilibj.templates.commands.SpinShooterBackwards;
import edu.wpi.first.wpilibj.templates.commands.downLeft;
import edu.wpi.first.wpilibj.templates.commands.downRight;
import edu.wpi.first.wpilibj.templates.commands.lowerShooter;
import edu.wpi.first.wpilibj.templates.commands.spinFeeder;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    
    Joystick leftJoy = new Joystick(1);
    Joystick rightJoy = new Joystick(2);
    Button button1 = new JoystickButton(leftJoy, RobotMap.LT_BUT_SHOOTER_BACKWARDS),
            button2 = new JoystickButton(leftJoy, RobotMap.LT_BUT_FEED_FRISBEE),
            button3 = new JoystickButton(leftJoy, RobotMap.LT_BUT_STRAIF_RIGHT),
            button4 = new JoystickButton(leftJoy, RobotMap.LT_BUT_STRAIF_LEFT),
            button5 = new JoystickButton(leftJoy, RobotMap.LT_BUT_CAMERA_ANGLE_ADJ),
            button6 = new JoystickButton(leftJoy, RobotMap.LT_BUT_CAMERA_CHECK),
            button7 = new JoystickButton(rightJoy, RobotMap.RT_BUT_ANGLER_DOWN),
            button8 = new JoystickButton(rightJoy, RobotMap.RT_BUT_ANGLER_UP),
            button9 = new JoystickButton(rightJoy, RobotMap.RT_BUT_LIFTER_DOWN),
            button10 = new JoystickButton(rightJoy, RobotMap.RT_BUT_LIFTER_UP),
            button11 = new JoystickButton(rightJoy, RobotMap.RT_BUT_SHARK_FIN),
            button12 = new JoystickButton(rightJoy, RobotMap.RT_BUT_SHARK_FIN_PRIME);
            //button13 = new JoystickButton(rightJoy, RobotMap.RT_BUT_SHOOTER_ANG_SETTING1);
    
    public double getLeftX()
    {
        return leftJoy.getX();
    }
    
    public double getLeftY()
    {
        return leftJoy.getY();
    }
    
    public double getLeftTwist()
    {
        return leftJoy.getTwist();
    }
    
    public OI(){
        
        button1.whenPressed(new SpinShooterBackwards());
        button2.whenPressed(new spinFeeder());
        button7.whenPressed(new lowerShooter());
        button8.whenPressed(new LiftShooter());
        button9.whenPressed(new downRight());
        button9.whenPressed(new downLeft());
        button10.whenPressed(new LiftLeft());
        button10.whenPressed(new LiftRight());
        button12.whenPressed(new FeederPrime());
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

