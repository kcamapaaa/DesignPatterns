package Vladislav.patterns.structural.decorator;

public class AdvacedRobot extends RobotDecorator {
    public AdvacedRobot(Robot robot) {
        super(robot);
    }

    String sayHello() {
        return "Hello from Advanced robot!";
    }

    @Override
    public String sayWords() {
        return super.sayWords() + sayHello();
    }
}
