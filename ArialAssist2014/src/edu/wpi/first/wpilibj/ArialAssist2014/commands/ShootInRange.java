package edu.wpi.first.wpilibj.ArialAssist2014.commands;

import edu.wpi.first.wpilibj.DriverStationLCD;

public class ShootInRange extends CommandBase
{
    Shoot shootCommand = new Shoot();
    boolean isDone;
    
    public ShootInRange()
    {

    }

    protected void initialize()
    {
        isDone = false;
    }

    protected void execute()
    {
        double range = shooter.GetRangeFeet();
        
        DriverStationLCD.getInstance().println(
                DriverStationLCD.Line.kUser1, 1, "Range ft: " + range);
        
        // Shoots if the range finder returns less then 10 ft.
        //if(range < 10.0)
        //{
        //    shootCommand.start();
        //    isDone = true;
        //}
    }

    protected boolean isFinished()
    {
        return isDone;
    }

    protected void end()
    {
    }

    protected void interrupted()
    {
    }
}
