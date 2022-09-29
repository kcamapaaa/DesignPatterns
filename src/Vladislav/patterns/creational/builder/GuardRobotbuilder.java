package Vladislav.patterns.creational.builder;

public class GuardRobotbuilder extends RobotBuilder {
    @Override
    void buildName() {
        robot.setName("Guard Robot");
    }

    @Override
    void buildType() {
        robot.setType(Type.GUARD);
    }

    @Override
    void buildCost() {
        robot.setCost(9999);
    }
}
