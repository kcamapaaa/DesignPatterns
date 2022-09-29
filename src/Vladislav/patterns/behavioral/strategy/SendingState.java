package Vladislav.patterns.behavioral.strategy;

public class SendingState implements EmailState {
    @Override
    public void getStatus() {
        System.out.println("Email is being send");
    }
}
