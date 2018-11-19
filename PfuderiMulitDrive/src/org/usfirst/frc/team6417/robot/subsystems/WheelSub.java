package org.usfirst.frc.team6417.robot.subsystems;

import org.usfirst.frc.team6417.robot.RobotMap;
import org.usfirst.frc.team6417.robot.commands.WheelCom;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class WheelSub extends Subsystem {

    public static Victor motorWheel = new Victor(RobotMap.MOTOR.WHEEL_PORT);

    public void initDefaultCommand() {
    	setDefaultCommand(new WheelCom());
    }
    
    public void start() {
    	motorWheel.set(1);
    }
    
    public void stop() {
    	motorWheel.stopMotor();
    }
        
}

