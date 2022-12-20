package h22;
import robocode.*;
import java.awt.Color;

// API help :
// robocode.sourceforge.io/docs/robocode/robocode/AdvancedRobot.html

public class Sebastian extends AdvancedRobot
{
	boolean movingForward;
	
	public void run() {
		setColors(Color.red, Color.blue, Color.green); // body,gun,radar
		turnLeft(getHeading() - 90);
		turnLeft(90);

		// Robot main loop
		while(true) {
			setAhead(40000);
			movingForward = true;
			setTurnRight(90);
			waitFor(new TurnCompleteCondition(this));
			setTurnLeft(180);
			waitFor(new TurnCompleteCondition(this));
			setTurnRight(180);
			waitFor(new TurnCompleteCondition(this));
		}
	}

	public void onScannedRobot(ScannedRobotEvent e) {
		//turnGunLeft(e.getHeading());
		
		if (e.getDistance() < 50) {
			fire(3);
		} else if (e.getDistance() < 100) {
			fire(2);
		} else if (e.getDistance() < 150) {
			fire(1);
		} else {
			fire(0.1);
		}
	}

	public void onHitByBullet() {
		
	}
	
	public void onHitWall() {
		if (movingForward) {
			setBack(40000);
			movingForward = false;
		} else {
			setAhead(40000);
			movingForward = true;
		}
	}
	
	public void onHitRobot(HitRobotEvent e) {
		if (movingForward) {
			setBack(40000);
			movingForward = false;
		} else {
			setAhead(40000);
			movingForward = true;
		}
	}
}