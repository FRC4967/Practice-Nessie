package frc.robot;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;

public class DriveTrain {
    private static Solenoid strafingSolenoids = new Solenoid(Robotmap.STRAFING_SOLENOIDS);
    private static DriveTrain driveTrainInstance;
    private static Talon rightDrive = new Talon(Robotmap.RIGHT_DRIVE);
    private static Talon leftDrive = new Talon(Robotmap.LEFT_DRIVE);

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
    
    public void strafe() {
        strafingSolenoids.set(true); 
    }
    
    public void destrafe() {
        strafingSolenoids.set(false);
    }
}
