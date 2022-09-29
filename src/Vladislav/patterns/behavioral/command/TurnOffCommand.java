package Vladislav.patterns.behavioral.command;

public class TurnOffCommand implements Command {
    Phone phone;

    public TurnOffCommand(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void execute() {
        phone.turnOff();
    }
}
