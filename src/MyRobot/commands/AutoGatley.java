package MyRobot.commands;

import MyRobot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class AutoGatley extends Command {

	@Override
	//ran once isFinished = true
	protected void end() {
		//stop the robot
		Robot.drive.driveValues(0, 0);
		
	}

	@Override
	//The infinite loop until isFinished = true
	protected void execute() {
		
		
	}

	@Override
	//What it does right when the program starts, once.
	protected void initialize() {
		//make the robot drive forward
		Robot.drive.driveValues(5, 0); // inches per second, turning in degrees/IPS?
		//tell the robot to wait for one second before letting isFinished return true, running end.
		this.setTimeout(1);
	}

	@Override
	protected void interrupted() {
		
	}

	@Override
	//This is what the program does when isFinished is set to true.
	protected boolean isFinished() {
		
		return this.isTimedOut(); 
		/*
		 * used to be return false;. this would make the program run forever.
		 * Now with this code, you can make the robot stop when the timer runs out.
		 */
	}
 
}
