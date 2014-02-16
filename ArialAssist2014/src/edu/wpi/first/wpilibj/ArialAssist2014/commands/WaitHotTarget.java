package edu.wpi.first.wpilibj.ArialAssist2014.commands;

public class WaitHotTarget extends CommandBase
{
    double timeout;
    
    public WaitHotTarget(double timeout)
    {
        this.timeout = timeout;
        setTimeout(timeout);
    }

    protected void initialize()
    {
    }

    protected void execute()
    {
    }

    protected boolean isFinished()
    {
        return vision.isHot || isTimedOut();
    }

    protected void end()
    {
    }
    
    protected void interrupted()
    {
    }
}
