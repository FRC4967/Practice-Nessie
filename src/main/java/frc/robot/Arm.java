package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Arm {
    private static TalonSRX arm;
    private static Arm armInstance;

    private Arm() {
        arm = new TalonSRX(Robotmap.LIFT_MOTOR);
    }

    public static Arm getInstance()
    {
        if (armInstance == null)
        {
            armInstance = new Arm();
        }
        return armInstance;
    }
    
    public void lowerArm() {
      arm.set(ControlMode.PercentOutput, 0.8);
    }
    
    public void raiseArm() {
        arm.set(ControlMode.PercentOutput, -0.8);
    }
    
    public void stopArm() {
        arm.set(ControlMode.PercentOutput, 0);
      }    
}
