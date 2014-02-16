package edu.wpi.first.wpilibj.ArialAssist2014.commands;

public class AutoDrive extends CommandBase
{
    double speed = 0.0;
    double direction = 0.0;
    
    public AutoDrive()
    {
        requires(driveTrain);
    }
    
    public AutoDrive(double speed, double direction, double time)
    {
        this.speed = speed;
        this.direction = direction;
        setTimeout(time);
    }

    protected void initialize()
    {
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
