// RobotBuilder Version: 3.1
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package frc.robot.subsystems;


import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class driveSubsystem extends SubsystemBase {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
private WPI_TalonSRX left1;
private WPI_TalonSRX left2;
private WPI_TalonSRX left3;
private WPI_TalonSRX right1;
private WPI_TalonSRX right2;
private WPI_TalonSRX right3;
private DifferentialDrive drive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    /**
    *
    */
    public driveSubsystem() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
left1 = new WPI_TalonSRX(0);
left1.configOpenloopRamp(Constants.rampFactor);
 

left2 = new WPI_TalonSRX(1);
left2.configOpenloopRamp(Constants.rampFactor);
 

left3 = new WPI_TalonSRX(2);
left3.configOpenloopRamp(Constants.rampFactor);
 
 

SpeedControllerGroup leftGroup = new SpeedControllerGroup(left1, left2, left3  );
 addChild("leftGroup",leftGroup);
 

right1 = new WPI_TalonSRX(3);
right1.configOpenloopRamp(Constants.rampFactor);
 
 

right2 = new WPI_TalonSRX(4);
right2.configOpenloopRamp(Constants.rampFactor);

 

right3 = new WPI_TalonSRX(5);
right3.configOpenloopRamp(Constants.rampFactor);

 

SpeedControllerGroup rightGroup = new SpeedControllerGroup(right1, right2, right3);
 addChild("rightGroup",rightGroup);
 

drive = new DifferentialDrive(leftGroup, rightGroup);
 addChild("Drive",drive);
 drive.setSafetyEnabled(false);
 drive.setExpiration(0.1);
 drive.setMaxOutput(1.0);



    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    public void driveCommand(double left, double right) {
            drive.tankDrive(left, right);
        
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run

    }

    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run when in simulation

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}

