package frc.robot;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;
//hi
public class DriveTrain {
    private static Solenoid strafingSolenoids = new Solenoid(Robotmap.STRAFING_SOLENOIDS);
    private static DriveTrain driveTrainInstance;
    private static Talon rightDrive = new Talon(Robotmap.RIGHT_DRIVE);
    private static Talon leftDrive = new Talon(Robotmap.LEFT_DRIVE);
    private static Talon frontStrafe = new Talon(Robotmap.FRONT_STRAFE);
    private static Talon backStrafe = new Talon(Robotmap.BACK_STRAFE);

    private DriveTrain() {
        
    }

    public static DriveTrain getInstance()
    {
        if (driveTrainInstance == null)
        {
            driveTrainInstance = new DriveTrain();
        }
        return driveTrainInstance;
    }

    public void drive(double rightPercentage, double leftPercentage) {
        rightDrive.set(rightPercentage);
        leftDrive.set(leftPercentage * -1);
    }
    
    public void strafeleft(){
        frontStrafe.set(0.5);
        backStrafe.set(0.5);
    }

    public void straferight(){
        frontStrafe.set(-0.5);
        backStrafe.set(-0.5);
    }

    public void stopstrafe(){
        frontStrafe.set(0);
        backStrafe.set(0);
    }

    public void strafe() {
        strafingSolenoids.set(true); 
    }
    
    public void destrafe() {
        strafingSolenoids.set(false);
    }
}
