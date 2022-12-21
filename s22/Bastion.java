package s22;
import robocode.*;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/JuniorRobot.html

/**
 * Bastion - a robot by (your name here)
 */
public class Bastion extends JuniorRobot
{
	/**
	 * run: Bastion's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// Some color codes: blue, yellow, black, white, red, pink, brown, grey, orange...
		// Sets these colors (robot parts): body, gun, radar, bullet, scan_arc
		setColors(orange,orange, red, orange, red);

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			turnAheadLeft(120,50);
			turnGunRight(40);
			turnGunLeft(130);
			turnAheadRight(120,50);
			
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot() {
		// Replace the next line with any behavior you would like
int sa = scannedAngle;

turnGunTo(sa);

if(scannedDistance>500){
fire(2.5);

}

else{
fire(0.5);

}

		

	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet() {
		// Replace the next line with any behavior you would like
		
int hbba = hitByBulletAngle;
turnGunTo(hbba);






}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall() {
		// Replace the next line with any behavior you would like
		
		turnBackRight(150,70);
		turnAheadLeft(100,80);
	}	
}
