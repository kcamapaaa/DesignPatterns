package Vladislav.patterns.behavioral.state;

public class SendingState implements EmailState {
    @Override
    public void next(Email email) {
        email.setEmailState(new ReceivingState());
    }

    @Override
    public void prev(Email email) {
        email.setEmailState(new WritingState());
    }

    @Override
    public void printStatus() {
        System.out.println("Email is being send");
    }
}
