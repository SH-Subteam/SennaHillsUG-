package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name = "armDemo", group = "Dream Machines")
public class ArmDemo extends LinearOpMode {

    public DMHardware robot = new DMHardware(false);

    @Override
    public void runOpMode() {
        robot.initTeleOpIMU(hardwareMap);
        robot.timer.reset();

        waitForStart();

        robot.armMotor.setPower(0.3);

        while (robot.timer.seconds() <= 1) {

        }
        robot.armMotor.setPower(0);


    }


}
