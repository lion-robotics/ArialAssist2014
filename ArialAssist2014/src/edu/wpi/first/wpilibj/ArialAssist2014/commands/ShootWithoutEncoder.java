/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.ArialAssist2014.commands;
public class ShootWithoutEncoder extends CommandBase
{
    
    boolean finished = false;
    
    public ShootWithoutEncoder()
    {
        requires(shooter);
    }

    // Called just before this Command runs the first time
    protected void initialize()
    {
        finished = false;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute()
    {
        
        if(!shooter.getSwitchState()){
            finished = true;
        }else{
            System.out.println(shooter.getCount());
            shooter.shootBall();
            finished = false;
        }
       
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished()
    {
        return finished;
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
