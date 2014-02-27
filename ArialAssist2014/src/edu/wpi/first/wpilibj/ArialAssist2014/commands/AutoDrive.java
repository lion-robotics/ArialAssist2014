package edu.wpi.first.wpilibj.ArialAssist2014.commands;

import edu.wpi.first.wpilibj.Timer;

public class AutoDrive extends CommandBase
{
    float speed = 0;
    double startTime = 0;
    double direction = 0.0;
    double time = 0;
    
    public AutoDrive()
    {
        requires(driveTrain);
    }
    
    public AutoDrive(float speed, double direction, double time)
    {
        this.speed = speed;
        this.direction = direction;
        this.time = time;
        
        setTimeout(time);
    }

    protected void initialize()
    {
       setTimeout(time);  
    }

    protected void execute()
    {
        
        driveTrain.driveArcade(speed, direction);
    }

    protected boolean isFinished()
    {
        return isTimedOut();
    }

    protected void end()
    {
    }

    protected void interrupted()
    {
    }
}
