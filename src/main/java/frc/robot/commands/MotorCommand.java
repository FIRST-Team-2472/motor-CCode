package frc.robot.commands;

import frc.robot.subsystems.MotorSubsystem;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.Command;

/** An example command that uses an example subsystem. */
public class MotorCommand extends Command {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final MotorSubsystem motorSubsystem;
  private final Supplier<Double> joystickValue;
  public MotorCommand(MotorSubsystem subsystem, Supplier<Double> joystickValue) {
    motorSubsystem = subsystem;
    this.joystickValue = joystickValue;
    addRequirements(subsystem);
  }

  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    motorSubsystem.setMotorSpeed(joystickValue.get());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
