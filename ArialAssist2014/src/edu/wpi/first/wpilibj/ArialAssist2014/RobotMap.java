package edu.wpi.first.wpilibj.ArialAssist2014;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into to a variable name. This provides flexibility changing wiring, makes checking the wiring easier and significantly reduces the number of magic numbers floating around.
 */
public class RobotMap {
    
    // PWM ports on the didital side car.
    public static final int FRONT_LEFT_DRIVE_TALON = 1,
        REAR_LEFT_DRIVE_TAlON = 2,
        FRONT_RIGHT_DRIVE_TALON = 3,
        REAR_RIGHT_DRIVE_TALON = 4;
    
    // Solenoid ports.
    public static final int LEFT_TRANSMISSION_SOLENOID = 1,
        RIGHT_TRANSMISSION_SOLENOID = 2;
    
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static final int leftMotor = 1;
    // public static final int rightMotor = 2;

    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static final int rangefinderPort = 1;
    // public static final int rangefinderModule = 1;
}
