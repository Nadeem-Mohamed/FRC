package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drive extends SubsystemBase{
    public static Drive instance;

    public static Drive getInstance(){
        return instance == null ? instance = new Drive() : instance;
    }

    @Override
    public void periodic(){
        //...
    }
}
