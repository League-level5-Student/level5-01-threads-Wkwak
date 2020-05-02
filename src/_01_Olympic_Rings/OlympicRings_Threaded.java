package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot red = new Robot(1200, 250);
		Robot blue = new Robot(500, 250);
		Robot black = new Robot(850, 250);
		Robot green = new Robot(1100, 600);
		Robot yellow = new Robot(600, 600);
		
		red.setSpeed(10);
		blue.setSpeed(10);
		black.setSpeed(10);
		green.setSpeed(10);
		yellow.setSpeed(10);
	
		red.setPenColor(Color.red);
		blue.setPenColor(Color.blue);
		black.setPenColor(Color.black);
		green.setPenColor(Color.green);
		yellow.setPenColor(Color.yellow);
		
		red.penDown();
		blue.penDown();
		black.penDown();
		green.penDown();
		yellow.penDown();
		
		Thread r1 = new Thread(()-> {
			for (int i = 0; i < 36; i++) {
				red.move(40);
				red.turn(10);
			}
		});
		Thread r2 = new Thread(()-> {
			for (int i = 0; i < 36; i++) {
				blue.move(40);
				blue.turn(10);
			}
		});
		Thread r3 = new Thread(()-> {
			for (int i = 0; i < 36; i++) {
				black.move(40);
				black.turn(10);
			}
		});
		Thread r4 = new Thread(()-> {
			for (int i = 0; i < 36; i++) {
				green.move(40);
				green.turn(10);
			}
		});
		Thread r5 = new Thread(()-> {
			for (int i = 0; i < 36; i++) {
				yellow.move(40);
				yellow.turn(10);
			}
		});
		
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
	}
	
}

