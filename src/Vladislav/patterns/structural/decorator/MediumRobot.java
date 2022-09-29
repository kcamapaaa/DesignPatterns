package Vladislav.patterns.structural.decorator;

public class MediumRobot extends RobotDecorator {

    public MediumRobot(Robot robot) {
        super(robot);
    }

    public String sayMedHi() {
        return "Hi from Med!";
    }

    @Override
    public String sayWords() {
        return super.sayWords() + sayMedHi();
    }
}
