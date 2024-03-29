// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.ArmSystem;
import frc.robot.subsystems.ClampSystem;
import frc.robot.subsystems.ShoulderSystem;
import frc.robot.subsystems.switchesSystem;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class PickUpOutside extends SequentialCommandGroup {
  /** Creates a new PickUp. */
  public PickUpOutside(ArmSystem m_armsystem, ClampSystem m_clampsystem, switchesSystem m_switchessystem, ShoulderSystem m_shouldersystem) {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(
        new RotateShoulderToValue(m_shouldersystem, 155), //Temp Values
        new armExtendToValue(m_armsystem, m_switchessystem, 2000), //Temp Values
        new clamp(m_clampsystem),
        new armExtendToValue(m_armsystem, m_switchessystem, 0),
        new armExtendToZero(m_armsystem, m_switchessystem)
        //new RotateShoulderToValue(m_shouldersystem, 0)
        );
  }
}
