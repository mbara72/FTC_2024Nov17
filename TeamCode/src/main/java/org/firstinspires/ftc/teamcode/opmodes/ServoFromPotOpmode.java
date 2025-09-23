package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.mechanisms.ProgrammingBoard1;

@TeleOp
public class ServoFromPotOpmode extends OpMode {

    // initialize the board
    ProgrammingBoard1 board = new ProgrammingBoard1();

    @Override
    public void init() {
        board.init(hardwareMap);

        //initialize the pot angle variable to the value of the potentiometer
        double potAngle = board.getPotAngle();

        // initialize the servo
        board.setServoPosition(potAngle);
    }

    @Override
    public void loop() {
        // read the value of the potentiometer
        double potAngle = board.getPotAngle();

        // run the servo to the corresponding point on the potentiometer
        board.setServoPosition(potAngle);
    }
}
