// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.IntakeConstants;

public class IntakeSubsystem extends SubsystemBase {

  WPI_TalonSRX intakeTalon;

  private DoubleSolenoid intakeDelivery;

  private boolean hasDeployed;
  /** Creates a new IntakeSubsystem. */
  public IntakeSubsystem() {
    intakeTalon = new WPI_TalonSRX(IntakeConstants.INTAKE_MOTOR);


    //intakeDelivery = new DoubleSolenoid(IntakeConstants.INTAKE_SOLENOID_DEPLOY, IntakeConstants.INTAKE_SOLENOID_RETRACT);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
