package _02_Advanced_Robot_Race;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	static Robot[] rs = new Robot[1000];
	static Random rr = new Random();
	
	public static void main(String[] args) {
		Thread[] threads = new Thread[rs.length];

		for(int i = 0; i < rs.length; i++) {
			rs[i] = new Robot();
			rs[i].setX(i*1);
			rs[i].setY(900);
			rs[i].setSpeed(10000);
			Robot d = rs[i];
			threads[i] = new Thread(()->move(d));
		}
		for(Thread t: threads) {
			t.start();
		}
	}
	private static void move(Robot r) {
		while(true) {
			r.move(rr.nextInt(300));
		}
	}
}
