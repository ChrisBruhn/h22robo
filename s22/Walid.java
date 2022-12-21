package s22;
import robocode.*;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/JuniorRobot.html

/**
 * Walid - a robot by (your name here)
 */
public class Walid extends JuniorRobot
{
	/**
	 * run: Walid's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// Some color codes: blue, yellow, black, white, red, pink, brown, grey, orange
		// Sets these colors (robot parts): body, gun, radar, bullet, scan_arc
		setColors(orange, blue, white, yellow, black);

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			turnAheadLeft(100,90);
			turnGunLeft(120);
			turnGunRight(45);
			
			
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot() {
		// Replace the next line with any behavior you would like
		int sa = scannedAngle;
		int sd = scannedDistance;
		if (sd <= 200){
			turnTo (sa);
			ahead (100);
			turnGunTo (sa);
			fire (3);
		} else if (sd <= 450) {
		turnTo (sa);
			fire (1);

		}
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet() {
		// Replace the next line with any behavior you would like
		turnBackLeft(120,90);
		
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall() {
		// Replace the next line with any behavior you would like
		back(20);
		turnLeft(45);
		ahead(49);
	}	
}
