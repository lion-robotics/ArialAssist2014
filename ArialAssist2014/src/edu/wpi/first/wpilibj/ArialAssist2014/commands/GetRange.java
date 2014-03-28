/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.ArialAssist2014.commands;

/**
 *
 * @author
 * Robotics
 */
public class GetRange extends CommandBase
{
    
    public GetRange()
    {
    }

    protected void initialize()
    {
        
    }

    protected void execute()
    {
        System.out.println("Range (voltage): " + shooter.getRangeVoltage() + " (value): " + shooter.getRangeValue());
        
    }

    protected boolean isFinished()
    {
        return true;
    }

    protected void end()
    {
    }
    
    protected void interrupted()
    {
    }
}
