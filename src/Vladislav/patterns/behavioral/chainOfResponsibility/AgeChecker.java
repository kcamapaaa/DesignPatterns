package Vladislav.patterns.behavioral.chainOfResponsibility;

public class AgeChecker extends Checker {

    public AgeChecker(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Age is under +18: " + message);
    }
}
