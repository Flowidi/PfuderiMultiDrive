/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team6417.robot;

import org.usfirst.frc.team6417.robot.commands.MecanumDriveCom;
import org.usfirst.frc.team6417.robot.commands.TankDriveCom;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	//Erstellen des Joysticks
	public static final Joystick joystick = new Joystick(RobotMap.JOYSTICK.JOYSTICK_PORT);
	
	//Erstellen der Buttons
	public static final JoystickButton buttonWinchPush = new JoystickButton(joystick, RobotMap.BUTTON.JOYSTICK_BUTTON_WINCH_PUSH_PORT);
	public static final JoystickButton buttonWinchPull = new JoystickButton(joystick, RobotMap.BUTTON.JOYSTICK_BUTTON_WINCH_PULL_PORT);
	public static final JoystickButton buttonWheel = new JoystickButton(joystick, RobotMap.BUTTON.JOYSTICK_BUTTON_WHEEL_PORT);	
	public static final JoystickButton buttonChangeDrive = new JoystickButton(joystick, RobotMap.BUTTON.JOYSTICK_BUTTON_CHANGE_DRIVE_PORT);
	public static final JoystickButton buttonMecanumDrive = new JoystickButton(joystick, RobotMap.BUTTON.JOYSTICK_BUTTON_MECANUM_DRIVE_PORT);
	public static final JoystickButton buttonTankDrive = new JoystickButton(joystick, RobotMap.BUTTON.JOYSTICK_BUTTON_TANK_DRIVE_PORT);
	
	//Erstellen der Motoren (im OI, da sie immer wieder in versch. Drives genutzt werden.
	public static Victor motorFrontRight = new Victor(RobotMap.MOTOR.MOTOR_FRONT_RIGHT_PORT);
	public static Victor motorFrontLeft = new Victor(RobotMap.MOTOR.MOTOR_FRONT_LEFT_PORT);
	public static Victor motorBackRight = new Victor(RobotMap.MOTOR.MOTOR_BACK_RIGHT_PORT);
	public static Victor motorBackLeft = new Victor(RobotMap.MOTOR.MOTOR_BACK_LEFT_PORT);
	
	//Erstellt das OI immer wieder neu, um die Commands abzufragen.
	private static OI INSTANCE;
	
	public static OI getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new OI();
	
		}
		return INSTANCE;
	}
	
	//Constructor des OI.
	private OI() {
		
		//Um den MecanumDrive zu aktivieren den Button drücken.
		if(RobotMap.SUBSYSTEM.IS_MECANUM_DRIVE_IN_USE == true) {
			buttonMecanumDrive.whenPressed(new MecanumDriveCom());
		}
		
		//Um den TankDrive zu aktivieren den Button drücken.
		if(RobotMap.SUBSYSTEM.IS_TANK_DRIVE_IN_USE == true) {
			buttonTankDrive.whenPressed(new TankDriveCom());
		}
	}
}
