package h22;
import robocode.*;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/JuniorRobot.html

/**
 * Uoghui - a robot by (your name here)
 */
public class Robert extends JuniorRobot
{
	/**
	 * run: Uoghui's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// Some color codes: blue, yellow, black, white, red, pink, brown, grey, orange...
		// Sets these colors (robot parts): body, gun, radar, bullet, scan_arc
		setColors(orange, blue, white, yellow, black);

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			ahead(50);
			turnGunRight(360);
			
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot() {
		// Replace the next line with any behavior you would like
	turnGunTo(scannedAngle);	
	if (scannedDistance<150) {
		fire(3);
	} else if (scannedDistance<=300) {
		fire(2);
	} else {
		fire(1);
	}
	ahead(50);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet() {
		// Replace the next line with any behavior you would like
		turnRight(hitByBulletAngle);
		ahead(200);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall() {
		// Replace the next line with any behavior you would like
		turnRight(90);
		ahead(200);
	}	
}
