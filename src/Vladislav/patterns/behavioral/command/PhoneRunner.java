package Vladislav.patterns.behavioral.command;

public class PhoneRunner {
    public static void main(String[] args) {
        Phone iPhone = new Phone();

        User user = new User(new StartCommand(iPhone), new ResetCommand(iPhone), new TurnOffCommand(iPhone));

        user.resetPhone();
        user.startPhone();
        user.turnOffPhone();
    }
}
