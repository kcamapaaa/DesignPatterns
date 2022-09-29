package Vladislav.patterns.behavioral.command;

public class StartCommand implements Command {
    Phone phone;

    public StartCommand(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void execute() {
        phone.start();
    }
}
