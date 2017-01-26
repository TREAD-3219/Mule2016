package MyRobot.commands;

import java.util.ArrayList;

import org.opencv.core.Mat;

import MyRobot.Robot;
import MyRobot.subsystems.GripPipeline;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.*;

public class Follow extends Command {
	
	public Follow() {
		requires(Robot.drive);
	}
	
	@Override
	protected void initialize(){
		Robot.drive.setSafety(false);
	}
	
	@Override
	protected void execute() {
		synchronized (Robot.imgLock) {
			//DriverStation.reportError("x: " + Robot.centerX, false);
			SmartDashboard.putNumber("Center X", Robot.centerX);
			if (Robot.centerX != 0) {
				Robot.drive.driveValues(Robot.centerX / 400, 0);
			} else {
				Robot.drive.driveValues(0, 0);
			}
		}
	}
	
	@Override
	protected void end() {
		Robot.drive.driveSpeed(0, 0);
		Robot.drive.setSafety(true);
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
