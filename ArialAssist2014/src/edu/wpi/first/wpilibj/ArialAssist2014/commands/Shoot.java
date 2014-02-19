package edu.wpi.first.wpilibj.ArialAssist2014.commands;

import edu.wpi.first.wpilibj.ADXL345_I2C;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Shoot extends CommandBase
{
    private int isShot = 175;
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
        pickupArm.retractArm();
        compressor.stop();
       // Timer.delay(1);
        
    }

    protected void execute()
    {
        if(shooter.getCount() < isShot){  //SmartDashboard.getNumber("Stop Position")) {
            
           // System.out.println(shooter.getCount());
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
        compressor.start();
    }

    protected void interrupted()
    {
    }
}
