/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.ArialAssist2014.subsystems;

import edu.wpi.first.wpilibj.ArialAssist2014.RobotMap;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author
 * Robotics
 */

public class RobotCompressor extends Subsystem
{
    Compressor robotCompressor;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public RobotCompressor(){
        
        robotCompressor = new Compressor(RobotMap.PRESSURE_SWITCH, RobotMap.COMPRESSOR_SPIKE);
        robotCompressor.start();
    }

    public void initDefaultCommand()
    {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
