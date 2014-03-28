package edu.wpi.first.wpilibj.ArialAssist2014.commands;

import edu.wpi.first.wpilibj.Timer;

public class WaitHotTarget extends CommandBase
{
    double timeout;
    
    public WaitHotTarget(double timeout)
    {
        this.timeout = timeout;
    }

    protected void initialize()
    {
        System.out.println(vision.isHot);
        System.out.println(vision.numberOfTargets);
    }

    protected void execute()
    {
    }

    protected boolean isFinished()
    {
        if(vision.isHot){
            Timer.delay(1.75);
            return true;
        }else{
            Timer.delay(1.75);
            return true;
        }
    }

    protected void end()
    {
    }
    
    protected void interrupted()
    {
    }
}
