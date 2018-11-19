package org.usfirst.frc.team6417.robot.subsystems;

import org.usfirst.frc.team6417.robot.OI;
import org.usfirst.frc.team6417.robot.Robot;
import org.usfirst.frc.team6417.robot.RobotMap;
import org.usfirst.frc.team6417.robot.commands.TankDriveCom;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class TankDriveSub extends Subsystem{

//	private static Victor motorFrontRight = new Victor(RobotMap.MOTOR.MOTOR_FRONT_RIGHT_PORT);
//	private static Victor motorFrontLeft = new Victor(RobotMap.MOTOR.MOTOR_FRONT_LEFT_PORT);
//	private static Victor motorBackRight = new Victor(RobotMap.MOTOR.MOTOR_BACK_RIGHT_PORT);
//	private static Victor motorBackLeft = new Victor(RobotMap.MOTOR.MOTOR_BACK_LEFT_PORT);
	
	private static double joystickYAxisRaw;
	private static double joystickXAxisRaw;
	private static double joystickYAxis;
	private static double joystickXAxis;
	
	@Override
	protected void initDefaultCommand() {
		
//		setDefaultCommand(new TankDriveCom());
		
	}
	
	public void drive() {
		
		joystickYAxisRaw = - OI.joystick.getY();
		joystickXAxisRaw = OI.joystick.getX();
		
		joystickYAxis = Robot.deadzone.getAxis(joystickYAxisRaw, RobotMap.DEADZONES.DEADZONE_VALUE);
		joystickXAxis = Robot.deadzone.getAxis(joystickXAxisRaw, RobotMap.DEADZONES.DEADZONE_VALUE);
		
		OI.motorFrontRight.set((joystickYAxis - joystickXAxis) * (-OI.joystick.getThrottle() / 2 + 0.5));
		OI.motorFrontLeft.set((joystickYAxis + joystickXAxis) * (-OI.joystick.getThrottle() / 2 + 0.5));
		OI.motorBackRight.set((joystickYAxis - joystickXAxis) * (-OI.joystick.getThrottle() / 2 + 0.5));
		OI.motorBackLeft.set((joystickYAxis + joystickXAxis) * (-OI.joystick.getThrottle() / 2 + 0.5));
		
	}
	
	public void stop() {
		
		OI.motorFrontRight.stopMotor();
		OI.motorFrontLeft.stopMotor();
		OI.motorBackRight.stopMotor();
		OI.motorBackLeft.stopMotor();
		
	}
}