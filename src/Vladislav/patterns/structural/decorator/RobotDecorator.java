package Vladislav.patterns.structural.decorator;

public class RobotDecorator implements Robot {
    Robot robot;

    public RobotDecorator(Robot robot) {
        this.robot = robot;
    }

    @Override
    public String sayWords() {
        return robot.sayWords();
    }
}
