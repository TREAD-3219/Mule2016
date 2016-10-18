package MyRobot.commands;

import MyRobot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class Forward extends Command{

	@Override
	protected void end() {
		Robot.drive.driveValues(0 ,0);
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void initialize(){
		Robot.drive.driveValues(.8 ,.7);
		Robot.drive.setSafety(false);
		this.setTimeout(5);
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
