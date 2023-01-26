package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.subsystems.DriveSubsystem;

public class ShiftGearCommand extends InstantCommand {
    private final DriveSubsystem m_driveSubsystem;

    public ShiftGearCommand(DriveSubsystem subsystem){
        this.m_driveSubsystem = subsystem;

        addRequirements(m_driveSubsystem);
    }
    
    @Override
    public void initialize(){
        m_driveSubsystem.shiftGear();
    }
}