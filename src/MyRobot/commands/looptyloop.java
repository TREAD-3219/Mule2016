package MyRobot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class looptyloop extends CommandGroup {
public looptyloop() {
	this.addSequential(new AutonomousCommand());
}
}
