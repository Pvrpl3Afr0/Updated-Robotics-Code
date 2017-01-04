package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by admin on 11/29/16. Edited by Haze and rewritten by Henry on 12/14/16.
 */
@TeleOp(name = "teleop", group = "hi")
public class MainRoboticsController extends LinearOpMode{
        DcMotor rightFront;
        DcMotor leftFront;
        DcMotor rightBack;
        DcMotor leftBack;
        Servo leftArm;
        Servo rightArm;

        @Override
        public void runOpMode() throws InterruptedException {
                rightFront = hardwareMap.dcMotor.get("rf");
                leftFront = hardwareMap.dcMotor.get("lf");
                rightBack = hardwareMap.dcMotor.get("rb");
                leftBack = hardwareMap.dcMotor.get("lb");
                leftArm = hardwareMap.servo.get("la");
                rightArm = hardwareMap.servo.get("ra");

                waitForStart();

                while (opModeIsActive()) {
            //Left Forward
                    leftBack.setPower(-gamepad1.left_stick_y);
                    leftFront.setPower(-gamepad1.left_stick_y);

            //Left Backward
                    leftBack.setPower(gamepad1.left_stick_y);
                    leftFront.setPower(gamepad1.left_stick_y);
            //Right Forward
                    rightBack.setPower(gamepad1.right_stick_y);
                    rightFront.setPower(gamepad1.right_stick_y);

            //Right Backward
                    rightBack.setPower(-gamepad1.right_stick_y);
                    rightFront.setPower(-gamepad1.right_stick_y);

            //Arms do nothing
                    leftArm.setPosition(0.0);
                    rightArm.setPosition(0.0);
            //Arms go up
                if (gamepad1.dpad_up);
                    leftArm.setPosition(1.0);
                    rightArm.setPosition(1.0);
            //Arms go down
                 if  (gamepad1.dpad_down);{
                        leftArm.setPosition(-1.0);
                        rightArm.setPosition(-1.0);
                    }

                    idle();
                }

        }
}

