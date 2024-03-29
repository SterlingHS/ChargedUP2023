// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.subsystems.ArmSystem;
import frc.robot.subsystems.ClampSystem;
import frc.robot.subsystems.ShoulderSystem;
import frc.robot.subsystems.switchesSystem;
import frc.robot.subsystems.LimelightSystem;
import frc.robot.subsystems.DriveSystem;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class DropConeFirst extends SequentialCommandGroup {
  /** Creates a new DropCone. */
  public DropConeFirst(DriveSystem m_drivesystem, ShoulderSystem m_shouldersystem, ArmSystem m_armsystem, ClampSystem m_clampsystem, switchesSystem m_switchessystem, LimelightSystem m_limelight) {
    // int[] shoulder_rotation = new int[]{350,550,660};
    // int[] arm_extension = new int[]{100,6000,8400};
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(
        new RotateShoulderToValue(m_shouldersystem, 690),
        new WaitCommand(1),
        new armExtendToValue(m_armsystem,m_switchessystem, 3200),
        new WaitCommand(0.25),
        new RotateShoulderToValue(m_shouldersystem, 600),
        new unclamp(m_clampsystem), 
        new WaitCommand(.25),
        new armExtendToValue(m_armsystem,m_switchessystem ,0),
        new armExtendToZero(m_armsystem,m_switchessystem),
        new RotateShoulderToValue(m_shouldersystem, 0)
    );
  }
}
