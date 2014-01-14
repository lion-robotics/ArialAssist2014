/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.ArialAssist2014.commands;

public class ArcadeDriveWithJoystick extends CommandBase {
    
    public ArcadeDriveWithJoystick() {
        requires(driveTrain);
    }

    protected void initialize() {
    }

    protected void execute() {
        driveTrain.driveArcade(oi.driverJoystick.getX(), oi.driverJoystick.getZ());
    }

    protected boolean isFinished() {
        return false;
    }
    
    protected void end() {
    }

    protected void interrupted() {
    }
}
