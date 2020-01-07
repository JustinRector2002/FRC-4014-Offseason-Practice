/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.ExampleCommand;
import frc.robot.commands.LeftMotorDriving;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Drivetrain extends Subsystem {

 private TalonSRX motorLeft1= new TalonSRX(RobotMap.MOTOR_LEFT_1_ID);
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new LeftMotorDriving());
    //setDefaultCommand(new ExampleCommand());
    
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void setleftMotor(double speed) {
    motorLeft1.set(ControlMode.PercentOutput, speed);
    /*motorLeft2.set(ControlMode.PercentOutput, speed);
     motorLeft3.set(ControlMode.PercentOutput, speed);*/
  } 
 /*  This is the method to control the right motor gear box on the drive base. 
     Speed is set negative so that when a set speed it told it runs with the left motors.
     
  public void setRightMotor(double speed){
     motorRight1.set(ControlMode.PercentOutput, -speed);
     motorRight2.set(ControlMode.PercentOutput, -speed);
     motorRight3.set(ControlMode.PercentOutput, -speed);
  }*/
}

