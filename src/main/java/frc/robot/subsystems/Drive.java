// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.GenericHID.Hand;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;



public class Drive extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  public static double throttle;
  public static ControlMode controlMode = ControlMode.PercentOutput;
  public static double turnleft;
  public static double turnright;  //check here for errors
  public Drive() {}

  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }

  public static void userDrive()
  {
    throttle = Constants.driveController.getY(Hand.kLeft);
    Constants.right1.set(controlMode, throttle);
    Constants.right2.set(controlMode, throttle);
    Constants.right3.set(controlMode, throttle);
    Constants.left1.set(controlMode, throttle);
    Constants.left2.set(controlMode, throttle);
    Constants.left3.set(controlMode, throttle);

  }
  public static void turn() {
    turnleft = Constants.driveController.getTriggerAxis(Hand.kLeft) - Constants.driveController.getTriggerAxis(Hand.kRight);
    turnright = Constants.driveController.getTriggerAxis(Hand.kRight) - Constants.driveController.getTriggerAxis(Hand.kLeft);
     if(turnleft > turnright) {
            Constants.right1.set(controlMode, turnleft);
            Constants.right2.set(controlMode, turnleft);
            Constants.right3.set(controlMode, turnleft);
            Constants.left1.set(controlMode, -turnleft);
            Constants.left2.set(controlMode, -turnleft);
            Constants.left3.set(controlMode, -turnleft);
    }

    if(turnright > turnleft) {
        Constants.right1.set(controlMode, -turnleft);
        Constants.right2.set(controlMode, -turnleft);
        Constants.right3.set(controlMode, -turnleft);
        Constants.left1.set(controlMode, turnleft);
        Constants.left2.set(controlMode, turnleft);
        Constants.left3.set(controlMode, turnleft);
}
  }
}
