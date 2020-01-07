package frc.robot.LimeLight;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;

public class GetData extends Subsystem {



    @Override
    public void periodic() {
        NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight");
        NetworkTableEntry tx = table.getEntry("tx");
        NetworkTableEntry ty = table.getEntry("ty");
        NetworkTableEntry ta = table.getEntry("ta"); 
        NetworkTableEntry tv = table.getEntry("tv");
        NetworkTableEntry ts = table.getEntry("ts");
            // Put code here to be run every loop
            //read values periodically
            double x = tx.getDouble(999.0);
            double y = ty.getDouble(999.0);
            double v = tv.getDouble(999.0);
            double area = ta.getDouble(999.0);
            double s = ts.getDouble(999.0);
            
            //post to smart dashboard periodically
        SmartDashboard.putNumber("LimelightX", x);
        SmartDashboard.putNumber("LimelightY", y);
        SmartDashboard.putNumber("LimelightArea", area);
        SmartDashboard.putNumber("LimelightTargetIsFound", v);
        SmartDashboard.putNumber("LimelightSlant", s);
        }

    @Override
    protected void initDefaultCommand() {
        periodic();
    }
    }