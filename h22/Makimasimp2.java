package s22;
import robocode.*;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/JuniorRobot.html

/**
 * Makmiasimp2 - a robot by (your name here)
 */
public class Makimasimp2 extends JuniorRobot
{
	/**
	 * run: Makmiasimp2's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// Some color codes: blue, yellow, black, white, red, pink, brown, grey, orange...
		// Sets these colors (robot parts): body, gun, radar, bullet, scan_arc
		setColors(red, red, red, red, red);

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			ahead(70);
			turnGunRight(90);
			turnGunRight(90);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot() {
		// Replace the next line with any behavior you would like
		int sa = 	scannedAngle;
		turnGunTo(sa);
			if(	scannedDistance>30){
				fire(1);
		
			}
		else{
		fire(3);
		}
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet() {
		// Replace the next line with any behavior you would like
		
		turnAheadRight(300,50);
		
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall() {
		// Replace the next line with any behavior you would like
	back(20);
		turnRight(30);
		ahead(50);

	}	
}
