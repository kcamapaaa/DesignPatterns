package Vladislav.patterns.creational.builder;

public abstract class RobotBuilder {
    Robot robot;

    void createRobot(){
        robot = new Robot();
    }

    abstract void buildName();
    abstract void buildType();
    abstract void buildCost();

    Robot getRobot() {
        return robot;
    }
}
