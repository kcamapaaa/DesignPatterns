package Vladislav.patterns.behavioral.strategy;

public class Runner {
    public static void main(String[] args) {
        Email email = new Email();

        email.setEmailState(new WritingState());
        email.showState();

        email.setEmailState(new SendingState());
        email.showState();

        email.setEmailState(new ReceivingState());
        email.showState();
    }
}
