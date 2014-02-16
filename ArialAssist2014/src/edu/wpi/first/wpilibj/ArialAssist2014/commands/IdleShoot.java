package edu.wpi.first.wpilibj.ArialAssist2014.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class IdleShoot extends CommandBase
{
    private int encoderLocation;
    boolean isPrimed = false;
    
    public IdleShoot()
    {
       super("IdleShoot");
        
       requires(shooter); 
    }

    protected void initialize()
    {
       // encoderLocation = shooter.getCount();
       // shooter.resetEncoder();
        shooter.startEncoder();
        isPrimed = false;
    }

    protected void execute()
    {
        if(shooter.getCount() > 0) { //SmartDashboard.getNumber("Start Position")){
            System.out.println(shooter.getCount());
            shooter.retractShooter();
            
        }
        else{
            shooter.idleShooter();
            isPrimed = true;
        }
        
    }

    protected boolean isFinished()
    {
        return isPrimed;
    }

    protected void end()
    {
        shooter.stopEncoder();
    }

    protected void interrupted()
    {
    }
}
