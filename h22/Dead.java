package h22;
import robocode.*;

public class Dead extends JuniorRobot
{
	public void run() {
	turnTo(180);
		setColors(black, white, red, blue, green);
		while(true) {
			ahead(200);
			turnGunLeft(360);
		}
	}
	public void onScannedRobot() {
		turnGunTo(scannedAngle);
		fire(1);
	}

	public void onHitByBullet() {
	}

	public void onHitWall() {
		turnRight(90);
	}
}
