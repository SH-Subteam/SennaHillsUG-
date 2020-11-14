package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@TeleOp(name = "ArmProtoDemo", group = "Dream Machines")
public class ArmProtoDemo extends LinearOpMode {
    public DMHardware robot = new DMHardware(true);

    @Override
    public void runOpMode() {
        robot.initTeleOpIMU(hardwareMap);
        robot.timer.reset();

        waitForStart();

        while (opModeIsActive()) {

            if (gamepad1.y) {
                robot.ringArm.setPosition(0.9);
            }
            if (gamepad1.a) {
                robot.ringArm.setPosition(-0.1);
            }


            if (gamepad1.x) {
                robot.ringClaw.setPosition(0.52);
            }
            if (gamepad1.b) {
                robot.ringClaw.setPosition(0.3);
            }

        }
    }

}
