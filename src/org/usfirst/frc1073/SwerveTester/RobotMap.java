// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc1073.SwerveTester;
    
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController drivetrainfrontLefDir;
    public static SpeedController drivetrainfrontLeftSpeed;
    public static SpeedController drivetrainfrontRightDir;
    public static SpeedController drivetrainfrontRightSpeed;
    public static SpeedController drivetrainbackLeftDir;
    public static SpeedController drivetrainbackLeftSpeed;
    public static SpeedController drivetrainbackRightDir;
    public static SpeedController drivetrainbackRightSpeed;
    public static AnalogPotentiometer encodersfrontLeftPot;
    public static AnalogPotentiometer encodersfrontRightPot;
    public static AnalogPotentiometer encodersbackLeftPot;
    public static AnalogPotentiometer encodersbackRightPot;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        drivetrainfrontLefDir = new VictorSP(0);
        LiveWindow.addActuator("Drivetrain", "frontLefDir", (VictorSP) drivetrainfrontLefDir);
        
        drivetrainfrontLeftSpeed = new VictorSP(1);
        LiveWindow.addActuator("Drivetrain", "frontLeftSpeed", (VictorSP) drivetrainfrontLeftSpeed);
        
        drivetrainfrontRightDir = new VictorSP(2);
        LiveWindow.addActuator("Drivetrain", "frontRightDir", (VictorSP) drivetrainfrontRightDir);
        
        drivetrainfrontRightSpeed = new VictorSP(3);
        LiveWindow.addActuator("Drivetrain", "frontRightSpeed", (VictorSP) drivetrainfrontRightSpeed);
        
        drivetrainbackLeftDir = new VictorSP(4);
        LiveWindow.addActuator("Drivetrain", "backLeftDir", (VictorSP) drivetrainbackLeftDir);
        
        drivetrainbackLeftSpeed = new VictorSP(5);
        LiveWindow.addActuator("Drivetrain", "backLeftSpeed", (VictorSP) drivetrainbackLeftSpeed);
        
        drivetrainbackRightDir = new VictorSP(6);
        LiveWindow.addActuator("Drivetrain", "backRightDir", (VictorSP) drivetrainbackRightDir);
        
        drivetrainbackRightSpeed = new VictorSP(7);
        LiveWindow.addActuator("Drivetrain", "backRightSpeed", (VictorSP) drivetrainbackRightSpeed);
        
        encodersfrontLeftPot = new AnalogPotentiometer(0, 360.0, 0.0);
        LiveWindow.addSensor("Encoders", "frontLeftPot", encodersfrontLeftPot);
        
        encodersfrontRightPot = new AnalogPotentiometer(1, 360.0, 0.0);
        LiveWindow.addSensor("Encoders", "frontRightPot", encodersfrontRightPot);
        
        encodersbackLeftPot = new AnalogPotentiometer(2, 360.0, 0.0);
        LiveWindow.addSensor("Encoders", "backLeftPot", encodersbackLeftPot);
        
        encodersbackRightPot = new AnalogPotentiometer(3, 360.0, 0.0);
        LiveWindow.addSensor("Encoders", "backRightPot", encodersbackRightPot);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
