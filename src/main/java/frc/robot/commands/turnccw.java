package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;

public class turnccw extends Command {

public turnccw() {
    requires(Robot.ExampleMotorControl);
}

    @Override 
    protected void execute() {
        Robot.ExampleMotorControl.turnccw();
            
          }

    @Override
    protected boolean isFinished() {
        return ( !Robot.oi.ccwButton.get());
    }

    @Override
    protected void end() {
        Robot.ExampleMotorControl.Hold();
    }

}