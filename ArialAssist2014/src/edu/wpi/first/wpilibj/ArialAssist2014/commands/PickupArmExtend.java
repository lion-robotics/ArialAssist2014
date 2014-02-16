package edu.wpi.first.wpilibj.ArialAssist2014.commands;

public class PickupArmExtend extends CommandBase
{
    int extendDistance = 200;
    boolean hasExtended = false;
    
    public PickupArmExtend()
    {   
        super("PickupArmExtend");
        
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
//        if(pickupArm.getCount() > hasExtended){  //SmartDashboard.getNumber("Stop Position")) {
//            
            System.out.println(pickupArm.getCount());
            pickupArm.extendArm();
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
        //return hasExtended;
        return false;
    }

    protected void end()
    {
    }

    protected void interrupted()
    {
    }
}
