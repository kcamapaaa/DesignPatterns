package Vladislav.patterns.behavioral.state;

public class WritingState implements EmailState {
    @Override
    public void next(Email email) {
        email.setEmailState(new SendingState());
    }

    @Override
    public void prev(Email email) {
        System.out.println("Sender is still writing the message.");
    }

    @Override
    public void printStatus() {
        System.out.println("Email is written and will be send soon.");
    }
}
