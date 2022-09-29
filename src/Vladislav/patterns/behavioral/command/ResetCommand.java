package Vladislav.patterns.behavioral.command;

public class ResetCommand implements Command {
    Phone phone;

    public ResetCommand(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void execute() {
        phone.reset();
    }
}
