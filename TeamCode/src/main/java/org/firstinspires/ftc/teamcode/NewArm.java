package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@TeleOp(name = "NewArmDemo", group = "Dream Machines")
public class NewArm extends LinearOpMode {
    public DMHardware robot = new DMHardware(true);

    @Override
    public void runOpMode() {
        robot.initTeleOpIMU(hardwareMap);
        robot.timer.reset();

        waitForStart();

        while (opModeIsActive()) {

            if (gamepad1.y) {
                robot.LiftMotor.setPower(0.25);
            }
            else if (gamepad1.a) {
                robot.LiftMotor.setPower(-0.25);
            }
            else {
                robot.LiftMotor.setPower(0);
            }



            if (gamepad1.x) {
                robot.ringClaw.setPosition(0.973);
            }
            if (gamepad1.b) {
                robot.ringClaw.setPosition(0.3);
            }

        }
    }

}
