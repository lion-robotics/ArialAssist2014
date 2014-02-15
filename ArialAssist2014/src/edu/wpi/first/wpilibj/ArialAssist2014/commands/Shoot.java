package edu.wpi.first.wpilibj.ArialAssist2014.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Shoot extends CommandBase
{
    private int isShot = -200;
    boolean hasShot = false;
    
    public Shoot()
    {
        super("Shoot");
        
        requires(shooter);
    }

    protected void initialize()
    {
        shooter.resetEncoder();
        shooter.startEncoder();
        hasShot = false;
    }

    protected void execute()
    {
        if(shooter.getCount() > isShot){  //SmartDashboard.getNumber("Stop Position")) {
            
            System.out.println(shooter.getCount());
            shooter.shootBall();
            
        }
        else{
            shooter.idleShooter();
            hasShot = true;
        }
    }

    protected boolean isFinished()
    {
        return hasShot;
    }

    protected void end()
    {
    }

    protected void interrupted()
    {
    }
}
