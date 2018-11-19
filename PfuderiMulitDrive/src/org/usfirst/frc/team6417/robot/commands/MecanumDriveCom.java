package org.usfirst.frc.team6417.robot.commands;

import org.usfirst.frc.team6417.robot.OI;
import org.usfirst.frc.team6417.robot.Robot;
import org.usfirst.frc.team6417.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class MecanumDriveCom extends Command {

    public MecanumDriveCom() {
       requires(Robot.mecanumDrive);
       System.out.println("MecanumDriveCom aktiviert!");
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	System.out.println("MecanumDrive.initialize!");
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    		Robot.mecanumDrive.drive();
    		
    		System.out.println("MecanumDrive.execute!");
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        
    	//Zum Deaktivieren des Drives sobald der TankDrive aktivert wird. So laufen nie 2 Drives übereinander.
    	if(OI.buttonTankDrive.get()) {
    		return true;
    	} else {
    		return false;
    	}
    	
    }

    // Called once after isFinished returns true
    protected void end() {
    	
    	Robot.mecanumDrive.stop();
    	
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	
    	end();
    	
    }
}
