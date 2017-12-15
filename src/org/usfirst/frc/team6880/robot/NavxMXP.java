/**
 * 
 */
package org.usfirst.frc.team6880.robot;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.SerialPort;

/**
 * @author frcusb6880
 *
 */
public class NavxMXP {
    public AHRS navx_device;
    
    
    /**
     * 
     */
    public NavxMXP() {
        super();
        navx_device = new AHRS(SPI.Port.kMXP);

        // Set the yaw to zero
        if (navx_device.isConnected()) {
            System.out.println("navx is connected");
        } else {
            System.out.println("navx is not connected");
        }
        if (navx_device.isCalibrating()) {
            // sleep for 20 milli seconds
            System.out.println("frc6880: still calibating navx....");
            System.out.println("calibrating navx");
//            curOpMode.sleep(20);
        } else {
            System.out.println("frc6880: Done with calibrating navx");
            System.out.println("Done with calibrating navx");
        }

        // ToDo:  The should be done only in the autonomous mode.
        if (true) {
            navx_device.zeroYaw();
        }
        System.out.printf("frc6880: Current yaw = %f", getModifiedYaw());

    }


    private double getModifiedYaw() {
        // TODO Auto-generated method stub
        return 0.0;
    }



}
