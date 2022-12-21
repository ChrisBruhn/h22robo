package s22;
import robocode.*;

public class BOB extends JuniorRobot
{
	int dir = 0;
	int wallHit = 0;
	public void run() {
		// Initialization of the robot should be put here

		// Some color codes: blue, yellow, black, white, red, pink, brown, grey, orange...
		// Sets these colors (robot parts): body, gun, radar, bullet, scan_arc
		setColors(red, blue, black, red, black);

		// Robot main loop
		while(true) {
			turnTo(dir);
			ahead(125);
			turnGunRight(360);
			back(100);
			turnGunLeft(360);
			wallHit = 0;
			dir += 12;
			
			
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot() {
		// Replace the next line with any behavior you would like	
		int edir = scannedAngle;
		int edit = scannedDistance;
	//	int evel = scannedVelocity;
		turnGunTo(edir);
			if (gunReady){
				if (edit <= 250){
					fire(3);
				}
				if (edit <= 400){
					fire(2);
				}
				if (edit <= 650){
					fire(1);
				}
					fire(0.5);
			}

	}
	public void onHitByBullet() {
		dir += 90;
		turnTo(dir);
	}

	public void onHitWall() {
		wallHit += 1;
		if(wallHit <= 2){
		ahead(100);
		}
		else{
		back(100);
		}
	}	
}
