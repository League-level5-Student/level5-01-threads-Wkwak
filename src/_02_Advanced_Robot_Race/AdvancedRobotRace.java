package _02_Advanced_Robot_Race;

import java.util.ArrayList;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0.
	// This time, use threads to make all of the robots go at the same time.
	public static void main(String[] args) {
		Robot[] robotArr = new Robot[4];

		for (int i = 0; i < robotArr.length; i++) {
			robotArr[i] = new Robot(i * 100 + 1200, 500);
			robotArr[i].setSpeed(8);
		}

		Thread r1 = new Thread(() -> {
			for (int i = 0; i < 36; i++) {
				robotArr[0].move(50);
				robotArr[0].turn(-10);
			}
		});

		Thread r2 = new Thread(() -> {
			for (int i = 0; i < 36; i++) {
				robotArr[1].move(50);
				robotArr[1].turn(-10);
			}
		});
		Thread r3 = new Thread(() -> {
			for (int i = 0; i < 36; i++) {
				robotArr[2].move(50);
				robotArr[2].turn(-10);
			}
		});

		Thread r4 = new Thread(() -> {
			for (int i = 0; i < 36; i++) {
				robotArr[3].move(50);
				robotArr[3].turn(-10);
			}
		});

		r1.start();
		r2.start();
		r3.start();
		r4.start();

	}
}
