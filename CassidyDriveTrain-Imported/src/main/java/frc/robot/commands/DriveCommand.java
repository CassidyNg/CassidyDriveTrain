// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;
import frc.robot.Constants.DriveConstants;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveSubsystem;


public class DriveCommand extends CommandBase {
  private final DriveSubsystem m_drivetrain;
  private Joystick joystick;
  private double acceleration_constant;
  /** Creates a new DriveCommand. */

  public DriveCommand(DriveSubsystem drivetrain, Joystick joystick) {
    m_drivetrain = drivetrain;
    this.joystick = joystick;
    this.acceleration_constant = DriveConstants.ACCELERATION_CONSTANT;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(m_drivetrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double speed = this.joystick.getY();
    double rotation = this.joystick.getX();
    double normalizedSpeed = speed; //Math.signum(speed) * Math.pow(speed, this.acceleration_constant);
    double normalizedRotation = rotation; //Math.signum(rotation) * Math.pow(rotation, this.acceleration_constant);
    this.m_drivetrain.diffDrive(normalizedSpeed, -normalizedRotation);
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
