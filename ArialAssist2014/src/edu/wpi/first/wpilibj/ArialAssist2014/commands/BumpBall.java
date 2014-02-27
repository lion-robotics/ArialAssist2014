/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.ArialAssist2014.commands;

/**
 *
 * @author
 * Robotics
 */
public class BumpBall extends CommandBase
{
    
    private int isShot = 7;
    boolean hasBumpShot = false;
    
    public BumpBall()
    {
        super("BumpShot");
        requires(shooter);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize()
    {
        shooter.resetEncoder();
        shooter.startEncoder();
        hasBumpShot = false;
        compressor.stop();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute()
    {
        if(!shooter.getSwitchState()){
            hasBumpShot = true;
        }else{
             if(shooter.getCount() < isShot){  //SmartDashboard.getNumber("Stop Position")) {
            
           // System.out.println(shooter.getCount());
            shooter.passShot();
            
            }
            else{
                shooter.idleShooter();
                hasBumpShot = true;
            }
        }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished()
    {
        return hasBumpShot;
    }

    // Called once after isFinished returns true
    protected void end()
    {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted()
    {
    }
}
