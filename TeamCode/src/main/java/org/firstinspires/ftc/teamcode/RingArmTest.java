package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.HardwareMap;

@Autonomous(name = "ArmRingTest", group = "DreamMachines")
public class RingArmTest extends LinearOpMode{

    public SHHardware robot = new SHHardware(false);

    @Override
    public void runOpMode() {
        robot.initTeleOpIMU(hardwareMap);
        robot.timer.reset();

        robot.arm.setPosition(1);

        waitForStart();

        robot.arm.setPosition(0);

        while (robot.getTime() <= 5) {

        }

        robot.arm.setPosition(1);

        robot.timer.reset();
    }
}
