package Vladislav.patterns.creational.builder;

public class TalkingRobotBuilder extends RobotBuilder {
    @Override
    void buildName() {
        robot.setName("Talking Robot");
    }

    @Override
    void buildType() {
        robot.setType(Type.TALKING);
    }

    @Override
    void buildCost() {
        robot.setCost(1500);
    }
}
