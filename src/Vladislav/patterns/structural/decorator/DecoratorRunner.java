package Vladislav.patterns.structural.decorator;

public class DecoratorRunner {
    public static void main(String[] args) {
        RobotDecorator advancedRobot = new AdvacedRobot(new MediumRobot(new SimpleRobot()));

        System.out.println(advancedRobot.sayWords());
    }
}
