package edu.wpi.first.wpilibj.ArialAssist2014.commands;


public class PickupArmRetract extends CommandBase
{
    boolean hasRetracted = false;
    
    public PickupArmRetract()
    {
        super("PickupArmRetract");
        
        requires(pickupArm);
    }

    protected void initialize()
    {
//        shooter.resetEncoder();
//        shooter.startEncoder();
//        hasExtended = false;
    }

    protected void execute()
    {
        //        if(pickupArm.getCount() < 0){  //SmartDashboard.getNumber("Stop Position")) {
//            
            System.out.println(pickupArm.getCount());
            pickupArm.retractArm();
//            
//        }
//        else{
//            pickupArm.stopArm();
//            hasExtended = true;
//        }
//       
    }

    protected boolean isFinished()
    {
//        return hasExtended;
        return false;
    }

    protected void end()
    {
    }

    protected void interrupted()
    {
    }
}
