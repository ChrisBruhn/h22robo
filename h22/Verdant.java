package s22;
import robocode.*;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/JuniorRobot.html

/**
 * Verdant - a robot by (your name here)
 */
public class Verdant extends JuniorRobot
{
	/**
	 * run: Verdant's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// Some color codes: blue, yellow, black, white, red, pink, brown, grey, orange...
		// Sets these colors (robot parts): body, gun, radar, bullet, scan_arc
		setColors(yellow, black, red, black, red);

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			ahead(100);
			turnGunRight(10);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot() {
		// Replace the next line with any behavior you would like
	int sd = scannedDistance;
	int sa = scannedAngle;
	turnTo(sa);
	if (sd < 20){
	fire(3);
		}
		else if (sd > 20 && sd < 50){
			fire(1.5);
		}
			else {fire(0.5);}
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet() {
		// Replace the next line with any behavior you would like
		back(10);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall() {
		// Replace the next line with any behavior you would like
	System.out.println(hitWallBearing);	
	back(20);
	}	
}
