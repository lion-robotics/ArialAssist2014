package edu.wpi.first.wpilibj.ArialAssist2014.commands;

import edu.wpi.first.wpilibj.ArialAssist2014.OI;
import edu.wpi.first.wpilibj.ArialAssist2014.subsystems.*;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The base for all commands. All atomic commands should subclass CommandBase. CommandBase stores creates and stores each control system. To access a subsystem elsewhere in your code in your code use CommandBase.exampleSubsystem
 *
 * @author Author
 */
public abstract class CommandBase extends Command {

    public static OI oi;

    public static DriveTrain driveTrain = new DriveTrain();
    public static PickupArm pickupArm = new PickupArm();
    public static PickupRoller pickupRoller = new PickupRoller();
    public static Shooter shooter = new Shooter();
    public static Kinect kinect = new Kinect();
    //public static Vision vision = new Vision(); //new Vision();
    public static RobotCompressor compressor = new RobotCompressor();

    public static void init() {
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
        oi = new OI();

        // Show what command your subsystem is running on the SmartDashboard
        SmartDashboard.putData(driveTrain);
        SmartDashboard.putData(pickupArm);
        SmartDashboard.putData(pickupRoller);
        SmartDashboard.putData(shooter);
       // SmartDashboard.putData(vision);
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
}
