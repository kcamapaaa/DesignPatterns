package Vladislav.patterns.creational.builder;

public class Director {
    RobotBuilder builder;

    public void setBuilder(RobotBuilder robotBuilder) {
        this.builder = robotBuilder;
    }

    Robot buildRobot() {
        builder.createRobot();
        builder.buildName();
        builder.buildType();
        builder.buildCost();

        return builder.getRobot();
    }
}
