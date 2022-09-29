package Vladislav.patterns.behavioral.state;

public class ReceivingState implements EmailState {
    @Override
    public void next(Email email) {
        System.out.println("The message has already received.");
    }

    @Override
    public void prev(Email email) {
        email.setEmailState(new SendingState());
    }

    @Override
    public void printStatus() {
        System.out.println("Message is received.");
    }
}
