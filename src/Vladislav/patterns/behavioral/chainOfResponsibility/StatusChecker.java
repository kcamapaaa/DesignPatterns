package Vladislav.patterns.behavioral.chainOfResponsibility;

public class StatusChecker extends Checker {
    public StatusChecker(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("You are not single: " + message);
    }
}
