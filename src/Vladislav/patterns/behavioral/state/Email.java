package Vladislav.patterns.behavioral.state;

public class Email {
    EmailState emailState = new WritingState();

    public void setEmailState(EmailState emailState) {
        this.emailState = emailState;
    }

    public void previousState() {
        emailState.prev(this);
    }

    public void nextState() {
        emailState.next(this);
    }

    public void printEmailState() {
        emailState.printStatus();
    }
}
