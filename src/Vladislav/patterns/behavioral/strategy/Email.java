package Vladislav.patterns.behavioral.strategy;

public class Email {
    EmailState emailState;

    public void setEmailState(EmailState emailState) {
        this.emailState = emailState;
    }

    public void showState() {
        emailState.getStatus();
    }
}
