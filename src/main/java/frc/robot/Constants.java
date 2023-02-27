// RobotBuilder Version: 4.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */


 public class Constants {

    // k values for the arm PID
    public static final double kTurnToleranceDeg = 400;
    public static final double kTurnRateToleranceDegPerS = 3000;
    public static final double MIN_ARM_POSITION = 0;
    public static double PID_ARM_P = 0.5;
    public static double PID_ARM_I = 0.04;
    public static double PID_ARM_D = 0.04;

    // USB Ports
    public static int MAIN_JOYDRIVER_USB_PORT = 0;
    public static int CO_JOYDRIVER_USB_PORT = 1;

    // CAN ID
    public static int DRIVETRAIN_LEFT_FRONT = 11;
    public static int DRIVETRAIN_LEFT_BACK = 13;
    public static int DRIVETRAIN_RIGHT_FRONT = 12;
    public static int DRIVETRAIN_RIGHT_BACK = 14;
    public static int SHOULDER_MOTOR_ONE = 22;
    public static int SHOULDER_MOTOR_TWO = 23;
    public static int ARM_MOTOR = 21;

    //Encoder ports
    public static int ENCODER_ARM_A = 2;
    public static int ENCODER_ARM_B = 3;
    public static int ENCODER_SHOULDER_A = 0;
    public static int ENCODER_SHOULDER_B = 1;

    //Shoulder Constants
    public static double MAX_SHOULDER_VELOCITY = 0.25;
    public static double MAX_SHOULDER_VELOCITY_UP = 0.5;
    public static double MAX_SHOULDER_POSITION = 70;

    public static double SHOULDER_SPEED = .3;
    public static double PID_SHOULDER_P = 0.04;
    public static double PID_SHOULDER_I = 0.005;
    public static double PID_SHOULDER_D = 0;
    public static final int DIO_SWITCH_SHOULDER_IN = 5;

    //Arm Constants
    public static double MAX_ARM_VELOCITY = 0.4;
    public static double ARM_SPEED = 0.3;
    public static int DIO_SWITCH_ARM_IN = 4;
    public static double MAX_ARM_POSITION = 12000; //Temp Test Value
    public static double ARM_IN_MAX_DISTANCE = 20; //Temp Test Value

    // Driving constants
    public static final double DRIVER_SLOWDOWN = .8;

    //Solenoid variables
    public static int CLAMP_SOLENOID_PORTA = 2;
    public static int CLAMP_SOLENOID_PORTB = 3;
    public static int PCM_CAN_ID = 5;

    

};


