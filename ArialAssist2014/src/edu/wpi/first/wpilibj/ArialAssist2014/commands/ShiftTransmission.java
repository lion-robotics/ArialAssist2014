package edu.wpi.first.wpilibj.ArialAssist2014.commands;


public class ShiftTransmission extends CommandBase {
    
    public boolean isHiSpeed;
    
    public ShiftTransmission() {
        super("ShiftTransmission");
        
        isHiSpeed = !driveTrain.getHiSpeed();
    }

    public ShiftTransmission(boolean hiSpeed){
        super("ShiftTransmission");
        
        isHiSpeed = hiSpeed;
    }

    protected void initialize() {
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
