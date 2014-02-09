package edu.wpi.first.wpilibj.ArialAssist2014;

public class RobotMap {
    
    // PWM ports on the didital side car.
    public static final int 
            FRONT_LEFT_DRIVE_TALON = 1,
            REAR_LEFT_DRIVE_TAlON = 2,
            FRONT_RIGHT_DRIVE_TALON = 5,
            REAR_RIGHT_DRIVE_TALON = 6,
            SHOOTER_TALON_ONE = 3,
            SHOOTER_TALON_TWO = 7,
            PICKUP_ARM_LEFT_TALON = 4, //This Talon can be changed to be used for the picker upper.
            PICKUP_ARM_RIGHT_TALON = 8, //This will be an open Talon
            PICKUP_ROLLER_ONE_TALON = 9,
            PICKUP_ROLLER_TWO_TALON = 10;
    
    // Solenoid ports.
    public static final int
            LEFT_TRANSMISSION_SOLENOID_ONE = 1,
            LEFT_TRANSMISSION_SOLENOID_TWO = 2,
            RIGHT_TRANSMISSION_SOLENOID_ONE = 3,
            RIGHT_TRANSMISSION_SOLENOID_TWO = 4;
    
    public static final int 
            TRANSMISSION_LOW_BUTTON = 1,
            TRANSMISSION_HI_BUTTON = 2,
            SHOOT_BUTTON = 3,
            AUTO_RETRACT = 1,
            RETRACT_BUTTON = 4,
            EXTEND_UP_BUTTON = 3,
            PULL_ROLLER = 5,
            PASS_ROLLER = 6;

    
    public static final int DIGITAL_SIDECAR = 1;
    
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static final int leftMotor = 1;
    // public static final int rightMotor = 2;

    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static final int rangefinderPort = 1;
    // public static final int rangefinderModule = 1;
}
