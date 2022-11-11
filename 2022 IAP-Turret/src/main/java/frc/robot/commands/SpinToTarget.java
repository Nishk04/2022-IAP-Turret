// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrain; 
import frc.robot.subsystems.PhotonVision; 

public class SpinToTarget extends CommandBase {
  /** Creates a new SpinToTarget. */
 
   public final PhotonVision photon;
   public final DriveTrain dt; 

   public SpinToTarget(DriveTrain dt, PhotonVision photon) {
     this.photon = photon; 
     this.dt = dt;//dt = drive train, it's an object
   
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    dt.tankDrive(-0.2,0.2);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return photon.targetExists();
  }
}
