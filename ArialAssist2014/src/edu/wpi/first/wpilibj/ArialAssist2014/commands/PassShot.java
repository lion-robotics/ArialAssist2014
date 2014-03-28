package edu.wpi.first.wpilibj.ArialAssist2014.commands;

/**
 *
 * @author
 * Robotics
 */
public class PassShot extends CommandBase
{
    private int isShot = 150;
    boolean hasPassShot = false;
    
    public PassShot()
    {
        super("PassShot");
        requires(shooter);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize()
    {
        shooter.resetEncoder();
        shooter.startEncoder();
        hasPassShot = false;
        compressor.stop();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute()
    {
        if(!shooter.getSwitchState()){
            hasPassShot = true;
        }else{
            if(shooter.getCount() < isShot){  
            
            System.out.println("Pass: " + shooter.getCount());
            shooter.passShot();
            
            }
            else{
                shooter.idleShooter();
                hasPassShot = true;
            }
        }
        
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished()
    {
        return hasPassShot;
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
