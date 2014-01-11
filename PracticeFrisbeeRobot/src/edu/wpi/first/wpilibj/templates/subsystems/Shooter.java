/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.AnalogModule;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.templates.Range;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.ShooterIdle;
import edu.wpi.first.wpilibj.templates.commands.angleMotorIdle;
import edu.wpi.first.wpilibj.templates.commands.feederIdle;

/**
 *
 * @author forbesje
 */
public class Shooter extends PIDSubsystem {
    // The constants for the P, I and D portion of PID

    private static final double Kp = 3;
    private static final double Ki = .2;
    private static final double Kd = 0.0;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    Jaguar _shooterMotor; // 9); Real bot
    Victor _angleMotor;
    Jaguar _feederMotor; // 5); Real bot
    AnalogModule _sensor;//changed from module 2 to 1
    double _angleMotorPower = 1;
    int _angleFudgeFactor = 5;
    //feed = 211
    Range sensorR = new Range(47, 136); //302
    Range angleR = new Range(9.4, 36.3);

//    double _topSensor = 302;
//    double _bottomSensor = 117;
//    double _topAngle = 45;
//    double _bottomAngle = 28;
    public Shooter() {
        super("Shooter", Kp, Ki, Kd);

        _shooterMotor = new Jaguar(5); // 9); Real bot
        _angleMotor = new Victor(6);
        _feederMotor = new Jaguar(9); // 5); Real bot
        _sensor = AnalogModule.getInstance(1);//changed from module 2 to 1

    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new ShooterIdle());
        setDefaultCommand(new feederIdle());
        setDefaultCommand(new angleMotorIdle());
    }

    /**
     * @return The value of the rangefinder used as the PID input device. These
     * values correspond to your PID setpoint, in this case the value can be
     * anywhere between 0v and 5v.
     */
    protected double returnPIDInput() {

        return _sensor.getValue(1);
    }

    /**
     * @param output The value to set the output to as determined by the PID
     * algorithm. This gets called each time through the PID loop to update the
     * output to the motor.
     */
    protected void usePIDOutput(double output) {
        _angleMotor.set(output);
    }

    // function to shoot a disk
    public void feedOne() {
        _feederMotor.set(.5);
        Timer.delay(0.75);
        _feederMotor.set(0);
    }

    public void setfeeder(double speed){
        _feederMotor.set(speed);
    }
    
    public void stopFeeder() {
        _feederMotor.set(0);
    }

    public void autoFeedPrime() {
        int finDetector = _sensor.getValue(8);
        if (finDetector < 400) {
            _feederMotor.set(-1);
        } else {
            _feederMotor.set(0);
        }
    }

    public void feedPrime() {
    }

    public void feedKick() {
        int shootCount = 1;
        //turns the relay value to forward (full speed only)
//
//        SmartDashboard.putNumber("FinMagnet4", _sensor.getValue(4));
//
//        //if you press the left trigger it will put a disk in the shooter, thus launching it
//        if (_rightStick.getRawButton(RobotMap.RT_BUT_SHARK_FIN)) {
//            _feederMotor.set(1);
//            //System.out.println("sharkFin ON");
//
//            //feedOne();
//        } else {
//            _feederMotor.set(0);
//        }
//        
//        
//        if (_rightStick.getRawButton(RobotMap.RT_BUT_SHARK_FIN_PRIME)) {
//            int finDetector = _sensor.getValue(4);
//            if (finDetector < 400 && finDetector > 250) {
//                _feederMotor.set(-.5);
//            }
//        } else {
//            _feederMotor.set(0);
//        }
    }
    
    public void setAngleMotor(double speed){
        _angleMotor.set(speed);
    }

    public void setShooter(double value) {
        _shooterMotor.set(value);
    }

//    public void update() {
//        double deadBand = 0.05;
//        double bot = 0.637;
//        double fot = 0.289;
//        feedPrime();
//        feedKick();
//
//        //they wanted varable speed ...
//        //if the right trigger is NOT being pressed then have the _shooterMotor spin at the throttle value
//        if (_rightStick.getRawButton(RobotMap.RT_BUT_SHOOTER_MOVER)) {
//            _shooterMotor.set(.8);
//        } //if it is being pressed sping backwards at 1/20 power
//        else {
//            _shooterMotor.set(0);
//        }
//        if (_leftStick.getRawButton(RobotMap.LT_BUT_SHOOTER_BACKWARDS)) {
//            _shooterMotor.set(-0.8);
//            //_feederMotor.set(-0.5);
//        }
//        if (_rightStick.getTrigger()) {
//            if (_rightStick.getRawButton(RobotMap.RT_BUT_SHOOTER_ANG_SETTING1)) {
//                //middleoftower
//                setAngleRel(0.64556); //was 0.72556, 0.68556
//                //extra: 7952755905512
//                //} else if (_leftStick.getRawButton(RobotMap.LT_BUT_SHOOTER_ANG_SETTING4))
//                //{
//                //  setAngleRel(72.556);
//            } else if (_rightStick.getRawButton(RobotMap.RT_BUT_SHOOTER_ANG_SETTING2)) {
//                //feederstation
//                setAngleRel(0.65234375); //was fot
//                //extra: 0625
//            } else if (_rightStick.getRawButton(RobotMap.RT_BUT_SHOOTER_ANG_SETTING3)) {
//                //27' arc
//                //origional was 1
//                setAngleRel(0.4645669291338583);
//            } else if (_rightStick.getRawButton(RobotMap.RT_BUT_SHOOTER_ANG_SETTING4)) {
//                //27' arc
//                //origional was 1
//                setAngleRel(0.87);
//            } else {
//                //shooter.set(0.5);                
//                setAngleRel((_rightStick.getThrottle() / -2) + 0.5);
//            }
//        } else {
//            _angleMotor.set(0);
//            //System.out.println("Angle: " + -_rightStick.getY());
//        }
//    }
    public void gotoAngleRel(double angleRel) {
        System.out.println("setAngle (" + angleRel + ")");
        double angle = angleR.getValueRel(angleRel);

        setAngle(angle, true);
    }

    // sets angle from 0 to 1 of full range
    public void setAngleRel(double angleRel) {
        //SmartDashboard.putNumber("AngleRel", angleRel);

        System.out.println("setAngleRel  (" + angleRel + ")");
        double angle = angleR.getValueRel(angleRel);

        setAngle(angle, false);
    }

    // Sets angle in degrees
    public void setAngle(double angle, boolean isAuto) {
        angle = angleR.limit(angle);

        double relPos = angleR.getRelativePos(angle);
        double x = sensorR.getValueRel(relPos); //_topSensor + relPos * (_bottomSensor - _topSensor);

        int sensorValue = 0;

        // 720 == top == 45 deg
        // 904 == bottom == 28 deg

        while (true) {
            sensorValue = _sensor.getValue(1);
            if (sensorValue < x - _angleFudgeFactor) {
                _angleMotor.set(-_angleMotorPower);
                System.out.println("Motor -");

            } else if (sensorValue > x + _angleFudgeFactor) {
                _angleMotor.set(_angleMotorPower);
                System.out.println("Motor +");
            } else {
                _angleMotor.set(0);
                break;
            }
            //SmartDashboard.putNumber("Angle sensor", sensorValue);

            System.out.println("Sensor: " + sensorValue + " X = " + x + " Angle = " + angle);

            if (isAuto) {
                Timer.delay(0.005);
            } else {
                break;
            }

        }
    }

}
