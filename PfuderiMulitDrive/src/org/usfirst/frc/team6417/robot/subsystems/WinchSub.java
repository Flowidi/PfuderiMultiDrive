package org.usfirst.frc.team6417.robot.subsystems;

import org.usfirst.frc.team6417.robot.RobotMap;
import org.usfirst.frc.team6417.robot.commands.WinchCom;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class WinchSub extends Subsystem {

	private static Victor motorWinch = new Victor(RobotMap.MOTOR.WINCH_PORT);

    public void initDefaultCommand() {

    	setDefaultCommand(new WinchCom());
    
    }
    
    public void push() {
    	motorWinch.set(1);
    }
    
    public void pull() {
    	motorWinch.set(-1);
    }
    
    public void stopMotor() {
    	motorWinch.stopMotor();
    }
}

