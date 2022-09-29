package Vladislav.patterns.behavioral.strategy;

public class ReceivingState implements EmailState {
    @Override
    public void getStatus() {
        System.out.println("Email is received.");
    }
}
