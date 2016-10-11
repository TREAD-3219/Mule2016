package MyRobot.commands;

import MyRobot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class robotics extends Command{

	@Override
	protected void end() {Robot.drive.driveValues(0, 0);
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void initialize() {this.setTimeout(9);
		Robot.drive.setSafety(false);
		Robot.drive.driveValues(6,0);
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean isFinished() {return this.isTimedOut();
		// TODO Auto-generated method stub
	}

}
