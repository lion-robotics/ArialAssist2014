/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;

/**
 *
 * @author austin2
 */
import edu.wpi.first.wpilibj.templates.subsystems.DriveTrain;
import edu.wpi.first.wpilibj.templates.subsystems.Lifters;
import edu.wpi.first.wpilibj.templates.subsystems.Shooter;

/**
 *
 * @author forbesje
 */

public class FullSystem{
    // All subsystems live here
    public DriveTrain driveTrain = new DriveTrain();
    public Lifters leftLifter = new Lifters(7, "right", 1, 2);
    public Lifters rightLifter = new Lifters(8, "left", 3, 5);
    public Shooter shooter = new Shooter();
    
    
}
