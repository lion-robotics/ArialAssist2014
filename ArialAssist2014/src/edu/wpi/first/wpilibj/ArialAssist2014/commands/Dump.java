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
public class Dump extends CommandBase
{
    
    private int isShot = 110;    //Bag Day Truss encoder value: 75
    boolean hasTrussShot = false;
    
    public Dump()
    {
        super("TrussShot");
        requires(shooter);
    }

    protected void initialize()
    {
        shooter.resetEncoder();
        shooter.startEncoder();
        hasTrussShot = false;
        compressor.stop();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute()
    {
        if(!shooter.getSwitchState()){
            hasTrussShot = true;
        }else{
             if(shooter.getCount() < isShot){  //SmartDashboard.getNumber("Stop Position")) {
            
           // System.out.println(shooter.getCount());
            shooter.shootBall();
            
            }
            else{
                shooter.idleShooter();
                hasTrussShot = true;
            }
        }
       
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished()
    {
        return hasTrussShot;
    }

    // Called once after isFinished returns true
    protected void end()
    {
        compressor.start();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted()
    {
    }
}
