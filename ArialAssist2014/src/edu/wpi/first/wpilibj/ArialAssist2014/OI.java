package edu.wpi.first.wpilibj.ArialAssist2014;

import edu.wpi.first.wpilibj.ArialAssist2014.commands.PassShot;
import edu.wpi.first.wpilibj.ArialAssist2014.commands.PickupArmExtend;
import edu.wpi.first.wpilibj.ArialAssist2014.commands.PickupArmRetract;
import edu.wpi.first.wpilibj.ArialAssist2014.commands.PickupRollerPass;
import edu.wpi.first.wpilibj.ArialAssist2014.commands.PickupRollerPull;
import edu.wpi.first.wpilibj.ArialAssist2014.commands.ResetEncoder;
import edu.wpi.first.wpilibj.ArialAssist2014.commands.RetractWithoutEncoder;
import edu.wpi.first.wpilibj.ArialAssist2014.commands.ShiftTransmission;
import edu.wpi.first.wpilibj.ArialAssist2014.commands.Shoot;
import edu.wpi.first.wpilibj.ArialAssist2014.commands.ShootWithoutEncoder;
import edu.wpi.first.wpilibj.ArialAssist2014.commands.TrussShot;
import edu.wpi.first.wpilibj.ArialAssist2014.commands.testEncoders;
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
    
    // Driver Joystick
    public Button hiTransmission = 
            new JoystickButton(driverJoystick, RobotMap.TRANSMISSION_HI_BUTTON);
   
    public Button lowTransmission = 
            new JoystickButton(driverJoystick, RobotMap.TRANSMISSION_LOW_BUTTON);
   
    public Button extend =
            new JoystickButton(driverJoystick, RobotMap.EXTEND_UP_BUTTON);
    
    public Button retract =
            new JoystickButton(driverJoystick, RobotMap.RETRACT_BUTTON);
    
    public Button passShot =
            new JoystickButton(shooterJoystick, RobotMap.PASS_SHOT_BUTTON);
    
    public Button trussShot =
            new JoystickButton(shooterJoystick, RobotMap.TRUSS_SHOT_BUTTON);
   
    public Button pullRoller =
            new JoystickButton(shooterJoystick, RobotMap.PULL_ROLLER);
    
    public Button passRoller =
            new JoystickButton(shooterJoystick, RobotMap.PASS_ROLLER);
    
    // Shooter Joystick.
    public Button shootButton =
            new JoystickButton(shooterJoystick, RobotMap.SHOOT_BUTTON);
    
     public Button readCamera =
            new JoystickButton(shooterJoystick, RobotMap.READ_CAMERA_BUTTON);
     
     public Button readEncoder = 
             new JoystickButton(shooterJoystick, RobotMap.CHECK_ENCODER_BUTTON);
     
     public Button checkShooter = 
             new JoystickButton(shooterJoystick, RobotMap.SHOOT_WITHOUT_ENCODER_BUTTON);
     
      public Button checkPrime = 
             new JoystickButton(shooterJoystick, RobotMap.PRIME_WITHOUT_ENCODER_BUTTON);
      
      public Button resetEncoder = 
              new JoystickButton(shooterJoystick, RobotMap.RESET_ENCODER_BUTTON);
     
    
    public OI(){
        hiTransmission.whenPressed(new ShiftTransmission(true));
        
        lowTransmission.whenPressed(new ShiftTransmission(false));
        
        extend.whileHeld(new PickupArmExtend());
        
        retract.whileHeld(new PickupArmRetract());
        
        passShot.whenPressed(new PassShot());
        
        trussShot.whenPressed(new TrussShot());
        
        pullRoller.whileHeld(new PickupRollerPull());
        
        passRoller.whileHeld(new PickupRollerPass());
        
        //readCamera.whenPressed(new FindHotTarget());
        
        shootButton.whenPressed(new Shoot());
        
        readEncoder.whenPressed(new testEncoders());
        
        checkShooter.whileHeld(new ShootWithoutEncoder());
        
        checkPrime.whileHeld(new RetractWithoutEncoder());
        
        resetEncoder.whenPressed(new ResetEncoder());
        
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

