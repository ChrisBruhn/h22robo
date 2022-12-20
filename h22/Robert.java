package h22;

import robocode.*;

public class Robert extends JuniorRobot {

    public void run() {
        while (true) {
            ahead(100);
            turnGunRight(360);
            back(100);
            turnGunRight(360);
        }
    }

    public void onScannedRobot() {
		turnTo(scannedAngle);
        fire(1);
    }
}