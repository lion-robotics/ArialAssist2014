package edu.wpi.first.wpilibj.ArialAssist2014.commands;

public class Wait extends CommandBase {
    
    public Wait() {
        setTimeout(0.0);
    }
    
    public Wait(double time){
        setTimeout(time);
    }

    protected void initialize() {
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
