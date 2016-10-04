package MyRobot.commands;

import MyRobot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class Utopia extends Command {

	@Override
	protected void end() {
		Robot.drive.driveValues(0, 0);
	}

	@Override
	protected void execute() {
		
	}

	@Override
	protected void initialize() { 
		Robot.drive.setSafety(false);
		Robot.drive.driveValues(15, 0);
		this.setTimeout(5);
	}

	@Override
	protected void interrupted() {
		
	}

	@Override
	protected boolean isFinished() {
		return this.isTimedOut();
	}

}
