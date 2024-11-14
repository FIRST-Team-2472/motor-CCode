package frc.robot;

import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.MotorCommand;
import frc.robot.subsystems.MotorSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class RobotContainer {
  private final MotorSubsystem motorSubsystem = new MotorSubsystem();

  private final CommandXboxController m_driverController =
      new CommandXboxController(OperatorConstants.kDriverControllerPort);

  public RobotContainer() {
    motorSubsystem.setDefaultCommand(new MotorCommand(motorSubsystem, () -> m_driverController.getLeftX()));
  }

  public Command getAutonomousCommand() {
    return null;
  }
}
