package h22;

import robocode.*;

public class JesperRobotten extends JuniorRobot {

    public void run() {
        while (true) {
            ahead(100);
            turnGunRight(360);
            turnRight(90);
        }
    }

    Random rand = new Random();
    public void onScannedRobot() {
        turnTo(scannedAngle + rand.nextInt(10, 45));
        fire(1);
    }
}
