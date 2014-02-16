package edu.wpi.first.wpilibj.ArialAssist2014.commands;

public class TrussShot extends CommandBase
{
    
    private int isShot = -150;
    boolean hasShot = false;
    
    public TrussShot()
    {
        super("TrussShot");
        requires(shooter);
    }

    protected void initialize()
    {
        shooter.resetEncoder();
        shooter.startEncoder();
        hasShot = false;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute()
    {
        if(shooter.getCount() > isShot){  //SmartDashboard.getNumber("Stop Position")) {
            
            System.out.println(shooter.getCount());
            shooter.trussShot();
            
        }
        else{
            shooter.idleShooter();
            hasShot = true;
        }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished()
    {
        return hasShot;
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
