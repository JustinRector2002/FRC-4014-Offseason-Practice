/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Robot;
import frc.robot.RobotMap;
import com.ctre.phoenix.motorcontrol.ControlMode;
/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class ExampleMotorControl extends Subsystem {

  public ExampleMotorControl(){

  }

  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {

    Robot.oi.cwButton.whenPressed(new frc.robot.commands.turncw());
    Robot.oi.ccwButton.whenPressed(new frc.robot.commands.turnccw());
    Robot.oi.allignButton.whenPressed(new frc.robot.commands.ExampleCommand());
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }


  public void turncw() {
    RobotMap.motorControl.set(ControlMode.PercentOutput, 0.5);
  }

public void turnccw(){
  RobotMap.motorControl.set(ControlMode.PercentOutput,-.5);
}

public void Hold(){
  RobotMap.motorControl.set(ControlMode.PercentOutput,0);
}

}