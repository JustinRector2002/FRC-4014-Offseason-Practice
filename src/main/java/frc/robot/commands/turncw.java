package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;

public class turncw extends Command {

public turncw() {
    requires(Robot.ExampleMotorControl);
}

    @Override 
    protected void execute() {
        Robot.ExampleMotorControl.turncw();
    }

    @Override
    protected boolean isFinished() {
        return ( !Robot.oi.cwButton.get());
    }

    @Override
    protected void end() {
        Robot.ExampleMotorControl.Hold();
    }
}