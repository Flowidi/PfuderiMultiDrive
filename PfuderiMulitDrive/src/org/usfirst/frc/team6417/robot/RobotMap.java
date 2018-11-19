/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team6417.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	public class MOTOR {
		
		public static final int MOTOR_FRONT_RIGHT_PORT = 0;
		public static final int MOTOR_FRONT_LEFT_PORT = 2;
		public static final int MOTOR_BACK_RIGHT_PORT = 1;
		public static final int MOTOR_BACK_LEFT_PORT = 3;
		
		public static final int WINCH_PORT = 5;
		public static final int WHEEL_PORT = 4;
		
	}
	
	public class JOYSTICK {
		
		public static final int JOYSTICK_PORT = 0;
		
	}
	
	public class BUTTON {
		
		public static final int JOYSTICK_BUTTON_WINCH_PUSH_PORT = 3;
		public static final int JOYSTICK_BUTTON_WINCH_PULL_PORT = 4;
		public static final int JOYSTICK_BUTTON_WHEEL_PORT = 2;	
		
		public static final int JOYSTICK_BUTTON_CHANGE_DRIVE_PORT = 1;
		
		public static final int JOYSTICK_BUTTON_MECANUM_DRIVE_PORT = 12;
		public static final int JOYSTICK_BUTTON_TANK_DRIVE_PORT = 11;
	
	}
	
	public static class SUBSYSTEM {
		
		public static boolean IS_TANK_DRIVE_IN_USE = true;
		public static boolean IS_MECANUM_DRIVE_IN_USE = true;
	
	}
	
	public static class DEADZONES {
		
		public static final double DEADZONE_VALUE = 0.15;
		
	}
	
}
