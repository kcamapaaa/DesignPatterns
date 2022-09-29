package Vladislav.patterns.behavioral.command;

public class User {
    private Command start;
    private Command reset;
    private Command turnOff;

    public User(Command start, Command reset, Command turnOff) {
        this.start = start;
        this.reset = reset;
        this.turnOff = turnOff;
    }

    public void startPhone() {
        start.execute();
    }

    public void resetPhone() {
        reset.execute();
    }

    public void turnOffPhone() {
        turnOff.execute();
    }
}
