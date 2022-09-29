package Vladislav.patterns.creational.builder;

public class CleaningRobotBuilder extends RobotBuilder {
    @Override
    void buildName() {
        robot.setName("Cleaning Robot");
    }

    @Override
    void buildType() {
        robot.setType(Type.CLEANER);
    }

    @Override
    void buildCost() {
        robot.setCost(1000);
    }
}
