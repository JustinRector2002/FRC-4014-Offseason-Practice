package frc.robot.commands;

import java.time.YearMonth;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;

public class LeftMotorDriving extends Command {

public LeftMotorDriving() {
    requires(Robot.drivetrain);
}

    @Override 
    protected void execute() {
       double leftStickY = Robot.oi.GetDriverRawAxis(RobotMap.JOYSTICK_Y);
        Robot.drivetrain.setleftMotor(leftStickY);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void end() {
    
    }
}