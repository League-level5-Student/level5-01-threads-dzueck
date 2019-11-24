package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	 // Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	static Robot dumbass = new Robot();
	static Robot dumbass2 = new Robot();
	static Robot dumbass3 = new Robot();
	static Robot dumbass5 = new Robot();
	
	public static void main(String[] args) {
		dumbass.setPenWidth(2);
		dumbass2.setPenWidth(2);
		dumbass3.setPenWidth(2);
		dumbass4.setPenWidth(2);
		dumbass5.setPenWidth(2);
		
		dumbass.setPenColor(new Color(0,0,255));
		dumbass2.setPenColor(new Color(255,0,0));
		dumbass3.setPenColor(new Color(0,255,0));
		dumbass4.setPenColor(new Color(255,255,0));
		dumbass5.setPenColor(new Color(0,0,0));
		
		dumbass.penDown();
		dumbass2.penDown();
		dumbass3.penDown();
		dumbass4.penDown();
		dumbass5.penDown();
		
		
		
		dumbass.setX(50);
		dumbass2.setX(200);
		dumbass2.setY(630);
		dumbass4.setY(630);

		dumbass3.setX(350);

		dumbass4.setX(500);

		dumbass5.setX(650);

		
		Thread r = new Thread(()->doShit(dumbass));
		Thread r2 = new Thread(()->doShit(dumbass2));

		Thread r3 = new Thread(()->doShit(dumbass3));

		Thread r4 = new Thread(()->doShit(dumbass4));
		Thread r5 = new Thread(()->doShit(dumbass5));
		r.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();

		
		

		//blue red green yellow black
	}
	
	private static void doShit(Robot r) {
		int death = 0;
		while(death < 360) {
			r.move(10);
			r.turn(5);
			death += 5;
		}
	}
}

