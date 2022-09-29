package Vladislav.patterns.creational.builder;

public class BuildRobotRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new GuardRobotbuilder());
        Robot robot = director.buildRobot();

        System.out.println(robot);
    }
}
