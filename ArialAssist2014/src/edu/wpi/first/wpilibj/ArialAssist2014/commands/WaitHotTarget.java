package edu.wpi.first.wpilibj.ArialAssist2014.commands;

import edu.wpi.first.wpilibj.Timer;

public class WaitHotTarget extends CommandBase
{
    double timeout;
    
    public WaitHotTarget()
    {
        
    }

    protected void initialize()
    {
        if(kinect.hot){
            setTimeout(.75);
        }else{
            setTimeout(3);
        }
//        System.out.println(vision.isHot);
//        System.out.println(vision.numberOfTargets);
    }

    protected void execute()
    {
    }

    protected boolean isFinished()
    {
        //if(vision.isHot){
            
            return isTimedOut();
       // }else{
           // Timer.delay(1.75);
            //return true;
        //}
    }

    protected void end()
    {
    }
    
    protected void interrupted()
    {
    }
}
