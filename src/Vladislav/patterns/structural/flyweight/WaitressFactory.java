package Vladislav.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class WaitressFactory {
    public static final Map<String, Waitress> waitressMap = new HashMap<>();

    public Waitress getWaitressByName(String name) {
        Waitress waitress = waitressMap.get(name);

        if(waitress == null) {
            switch (name) {
                case "Masha" -> {
                    System.out.println("Hiring Masha");
                    waitress = new Masha();
                }
                case "Galya" -> {
                    System.out.println("Hiring Galya");
                    waitress = new Galya();
                }
                default -> System.out.println("No such waitress");
            }
            waitressMap.put(name, waitress);
        }
        return waitress;
    }
}
