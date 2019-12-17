package frc.robot.LimeLight;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;

public class GetData extends Subsystem {

    @Override
    protected void initDefaultCommand() {
        }


    @Override
    public void periodic() {
        NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight");
        NetworkTableEntry tx = table.getEntry("tx");
        NetworkTableEntry ty = table.getEntry("ty");
        NetworkTableEntry ta = table.getEntry("ta"); 
        NetworkTableEntry tv = table.getEntry("tv");
            // Put code here to be run every loop
            //read values periodically
            double x = tx.getDouble(0.0);
            double y = ty.getDouble(0.0);
            double v = tv.getDouble(0.0);
            double area = ta.getDouble(0.0);
            
            //post to smart dashboard periodically
        SmartDashboard.putNumber("LimelightX", x);
        SmartDashboard.putNumber("LimelightY", y);
        SmartDashboard.putNumber("LimelightArea", area);
        SmartDashboard.putNumber("LimelightTargetIsFound", v);
        }   
    }