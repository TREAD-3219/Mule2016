package MyRobot.commands;

import MyRobot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class CreativeName extends Command {

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		Robot.drive.setSafety(true);
		Robot.drive.driveSpeed(0,0);
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		Robot.drive.setSafety(false);
		Robot.drive.driveSpeed(30, 0);
		this.setTimeout(3);
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		this.end();
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return this.isTimedOut();
	}

}
