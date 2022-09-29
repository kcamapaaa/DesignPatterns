package Vladislav.patterns.behavioral.state;

public class Runner {
    public static void main(String[] args) {
        Email email = new Email();

        email.printEmailState();
        email.nextState();

        email.printEmailState();
        email.nextState();

        email.printEmailState();
        System.out.println("Now return back...");
        System.out.println("=====================");
        email.previousState();
        email.printEmailState();
        System.out.println("And again...");
        System.out.println("=========================");
        email.nextState();
        email.printEmailState();
        email.nextState();

    }
}
