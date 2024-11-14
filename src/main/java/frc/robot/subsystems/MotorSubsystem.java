package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.MotorConstants;
public class MotorSubsystem extends SubsystemBase {
  private final CANSparkMax motor;
  public MotorSubsystem() {
    motor = new CANSparkMax(MotorConstants.kMotorID, MotorType.kBrushless);
  }

  public void setMotorSpeed(double speed){
    motor.set(speed);
  }
  @Override
  public void periodic() {
  }

  @Override
  public void simulationPeriodic() {
  }
  
}

