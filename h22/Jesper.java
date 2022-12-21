package h22;

import robocode.*;

//Klassisk Jesper throw
public class Jesper extends JuniorRobot {

    public void run() {
        while (true) {
            ahead(100);
            turnGunRight(360);
            turnRight(90);
        }
    }

    public void onScannedRobot() {
        turnTo(scannedAngle + throwAngle(scannedAngle));
        fire(1);
    }

    public int throwAngle(int value){
        return (((value * 12345) % 3 - 123) % 41 + 21) % 90 - 45;
    }
}