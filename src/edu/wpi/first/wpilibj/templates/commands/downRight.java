/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

/**
 *
 * @author austin2
 */
public class downRight extends CommandBase {
    
    public downRight() {
        requires(sys.rightLifter);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        sys.rightLifter.down();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        if(sys.rightLifter.triggeredUp()){
            return true;
        }
        else if(sys.rightLifter.triggeredDown()){
            return true;
        }
        else{
            return false;
        }
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
