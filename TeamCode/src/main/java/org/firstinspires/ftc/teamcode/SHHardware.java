package org.firstinspires.ftc.teamcode;

// Importing all of the packages

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.TouchSensor;
import com.qualcomm.robotcore.util.ElapsedTime;

public class SHHardware {

    // Instantiating the hardware classes
    public Servo arm, claw;

    public boolean runThisWithEncoders;

    HardwareMap hwMap;
    ElapsedTime timer = new ElapsedTime();


    // Methods...

    public SHHardware(boolean runThisWithEncoders) {
        this.runThisWithEncoders = runThisWithEncoders;
    }

    public void initTeleOpIMU(HardwareMap hwMap) {
        this.hwMap = hwMap;

        timer.reset();


        // Adding variable names to the hardware...

        claw = hwMap.servo.get("claw");
        claw.setPosition(0.2);

        arm = hwMap.servo.get("arm");
        claw = hwMap.servo.get("claw");

    }

    // Method to get current time...
    public double getTime() {

        return timer.time();
    }

}
