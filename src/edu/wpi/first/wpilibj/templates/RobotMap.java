package edu.wpi.first.wpilibj.templates;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static final int leftMotor = 1;
    // public static final int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static final int rangefinderPort = 1;
    // public static final int rangefinderModule = 1;
    
        // Button function assignments
    public static int RT_BUT_SHOOTER_MOVER = 11;
    public static int RT_BUT_SHARK_FIN = 12;
    public static int RT_BUT_SHARK_FIN_PRIME = 9;
    public static int RT_BUT_ANGLER_UP = 7;
    public static int RT_BUT_ANGLER_DOWN = 8;
    public static int RT_BUT_LIFTER_UP = 5;
    public static int RT_BUT_LIFTER_DOWN = 6;
    public static int RT_BUT_SHOOTER_ANG_SETTING1 = 5;
    public static int RT_BUT_SHOOTER_ANG_SETTING2 = 3;
    public static int RT_BUT_SHOOTER_ANG_SETTING3 = 4;
    public static int RT_BUT_SHOOTER_ANG_SETTING4 = 6;
    public static int LT_BUT_SHOOTER_ANG_SETTING4 = 4;
    
    public static int LEFT_TOP_SWITCH = 3;
    public static int LEFT_BOT_SWITCH = 5;
    public static int RIGHT_TOP_SWITCH = 1;
    public static int RIGHT_BOT_SWITCH = 2;
    
    
            
    public static int LT_BUT_CAMERA_CHECK = 6;
    public static int LT_BUT_CAMERA_ANGLE_ADJ = 9;
    public static int LT_BUT_FEED_FRISBEE = 2;
    public static int LT_BUT_STRAIF_LEFT = 7;
    public static int LT_BUT_STRAIF_RIGHT = 11;
    public static int LT_BUT_SHOOTER_BACKWARDS = 8;
}

