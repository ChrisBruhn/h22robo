package h22;

import robocode.*;

public class Robert extends Robot {

    public void run() {
        while (true) {
            ahead(100);
            turnGunRight(360);
            back(100);
            turnGunRight(360);
        }
    }

    public void onScannedRobot(ScannedRobotEvent e) {
        if(e.getDistance() > 15)
            return;

        double desiredRotation = e.getBearing();
        turnGunRight(desiredRotation);
        fire(1);
    }
}
