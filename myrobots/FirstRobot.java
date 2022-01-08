package myrobots;

import robocode.Robot;

public class FirstRobot extends Robot {

    @Override
    public void run() {
        while (true) {
            ahead(100);
            back(100);
        }
    }

}
