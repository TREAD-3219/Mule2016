package MyRobot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoCircle extends CommandGroup{
	public AutoCircle() {
		this.addSequential(new Forward());
	}
}
