package frc.robot;
import edu.wpi.first.wpilibj.Compressor;

public class Pneumatics {
    public static Compressor compressor = new Compressor();
    public static void compress() {
        compressor.start();
    }
    public static void compressDisable() {
        compressor.stop();
    }
    
    public boolean enabled() {
        return true;
    }
}
