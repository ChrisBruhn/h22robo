package h22;
import robocode.*;
import robocode.JuniorRobot;
import java.awt.*;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/JuniorRobot.html

/**
 * Target - a robot by Mikkel Ellegaard
 */
public class Target extends JuniorRobot
{
	/**
	 * run: Target's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// Some color codes: blue, yellow, black, white, red, pink, brown, grey, orange...
		// Sets these colors (robot parts): body, gun, radar, bullet, scan_arc
		setColors(orange, blue, white, yellow, black);


		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			
			if (robotY <= fieldHeight/8) {
			turnTo(180);
			ahead(200);
			}
			if (robotY >= fieldHeight*0.8) {
			turnTo(0);
			ahead(200);
			}
			if (robotX <= fieldWidth/8) {
			turnTo(90);
			ahead(200);
			}
			if (robotX >= fieldWidth*0.8) {
			turnTo(270);
			ahead(200);
			}
			ahead(100);
			turnRight(180);
	}
	}
	

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot() {
		// Replace the next line with any behavior you would like
		
		//Is target close enough?
		if (scannedDistance <= fieldWidth/3) {
		//Will we drive straight to attacker?
			if (Math.abs(scannedAngle - heading) < 90) turnRight(45);
		//Move slightly
			ahead(50);
		//Take aim
			turnGunTo(scannedAngle);
		//Shoot
			if (gunReady == true) fire(2);
		}
		//Is target too far away?
		else if (scannedDistance > fieldWidth/3) {
		//Turn to target, but not directly to
			turnTo(scannedAngle - 90);
		//Get closer
			ahead(scannedDistance - fieldWidth/3);
		//Execute first part again
			if (scannedDistance <= fieldWidth/3) {
		//Will we drive straight to attacker?
			if (Math.abs(scannedAngle - heading) < 90) turnRight(45);
		//Move slightly
			ahead(50);
		//Take aim
			turnGunTo(scannedAngle);
		//Shoot
			if (gunReady == true) fire(2);
		}
		}
}
	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet() {
		// Replace the next line with any behavior you would like
		
		//Turn robot unless we end up facing the attacker
		if (Math.abs(hitByBulletAngle - heading) > 90) turnRight(90);
		//Go forward so we don't die quickly
		ahead(200);
		//Look for attacker
		turnGunRight(360);
		//If we see an enemy, OnScannedRobot() will execute
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall() {
		// Replace the next line with any behavior you would like
		turnRight(90);
		back(20);
	}	
}
