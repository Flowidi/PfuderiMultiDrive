package org.usfirst.frc.team6417.robot.commands;

import org.usfirst.frc.team6417.robot.OI;
import org.usfirst.frc.team6417.robot.Robot;
import org.usfirst.frc.team6417.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class TankDriveCom extends Command{

	public TankDriveCom() {
		requires(Robot.tankDrive);
		System.out.println("TankDriveCom aktiviert!");
	}
	
	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
		System.out.println("TankDrive.initialize!");
	}
	
	@Override
	protected void execute() {
		
			Robot.tankDrive.drive();	
    		System.out.println("TankDrive.execute!");

			
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		
		if(OI.buttonMecanumDrive.get()) {
    		return true;
    	} else {
    		return false;
    	}
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
		
		Robot.tankDrive.stop();
	
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
		
		end();
		
	}
}
