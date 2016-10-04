package MyRobot.commands;

import MyRobot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class AutoCommandy extends Command {

	@Override
	protected void end() {
		Robot.drive.driveValues(0, 0);
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void initialize() {
		Robot.drive.setSafety(false);
		Robot.drive.driveValues(5, 0);
		this.setTimeout(1);
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean isFinished() {
		return this.isTimedOut();
	}

}
