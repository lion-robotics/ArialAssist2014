package edu.wpi.first.wpilibj.ArialAssist2014;

public class RobotMap {
    
    // PWM ports on the didital side car.
    public static final int 
            FRONT_LEFT_DRIVE_TALON = 1,
            REAR_LEFT_DRIVE_TAlON = 2,
            FRONT_RIGHT_DRIVE_TALON = 6,
            REAR_RIGHT_DRIVE_TALON = 7,
            SHOOTER_TALON_ONE = 3,
            SHOOTER_TALON_TWO = 4,
            PICKUP_ARM_LEFT_TALON = 8, //This Talon can be changed to be used for the picker upper.
            PICKUP_ARM_RIGHT_TALON = 9, //This will be an open Talon
            PICKUP_ROLLER_ONE_TALON = 5,
            COMPRESSOR_SPIKE = 10;
    
    // Solenoid ports.
    public static final int
            LEFT_TRANSMISSION_SOLENOID_ONE = 1,
            LEFT_TRANSMISSION_SOLENOID_TWO = 2,
            RIGHT_TRANSMISSION_SOLENOID_ONE = 3,
            RIGHT_TRANSMISSION_SOLENOID_TWO = 4;
    
    
    //encoders
    public static final int
            DRIVE_ENCODER_PORT_1 = 1,
            DRIVE_ENCODER_PORT_2 = 2,
            ARM_ENCODER_PORT_1 = 3,
            ARM_ENCODER_PORT_2 = 4;
    
    // Driver Joystick
    public static final int 
            TRANSMISSION_LOW_BUTTON = 11, //Driver 1
            TRANSMISSION_HI_BUTTON = 12, //Driver 1
            RETRACT_BUTTON = 3, //Driver 1
            EXTEND_UP_BUTTON = 5; //Driver 1


    // Shooter Joystick
    public static final int
            SHOOT_BUTTON = 1, //Shooter 2
            READ_CAMERA_BUTTON = 7, //Shooter 2
            CHECK_ENCODER_BUTTON = 6, //Shooter 2
            SHOOT_WITHOUT_ENCODER_BUTTON = 9, //Shooter 2, Oh Shit Button 
            PRIME_WITHOUT_ENCODER_BUTTON = 10, //Shooter 2
            TRUSS_SHOT_BUTTON = 3,
            PASS_SHOT_BUTTON = 2,
            PASS_ROLLER = 11,
            PULL_ROLLER = 12,
            RESET_ENCODER_BUTTON = 4; //Shooter 2
    
    
    public static final int DIGITAL_SIDECAR = 1;
    
    public static final int
            PRESSURE_SWITCH = 5; 
    
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static final int leftMotor = 1;
    // public static final int rightMotor = 2;

    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static final int rangefinderPort = 1;
    // public static final int rangefinderModule = 1;
}
