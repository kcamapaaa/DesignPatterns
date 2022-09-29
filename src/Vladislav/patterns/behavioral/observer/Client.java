package Vladislav.patterns.behavioral.observer;

import java.util.List;

public class Client implements Observer {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> emails) {
        System.out.println("\nHello, " + name + "! We have updated our assortment!");
        emails.forEach(x -> System.out.print("[" + x + "]"));
        System.out.println("\n==========================================\n");
    }
}
