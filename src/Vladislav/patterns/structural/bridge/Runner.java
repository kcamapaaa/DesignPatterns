package Vladislav.patterns.structural.bridge;

public class Runner {
    public static void main(String[] args) {
        Aircraft boeing = new Boeing(new Yellow());
        Aircraft airbus = new Airbus(new Black());

        System.out.println(boeing.draw());
        System.out.println(airbus.draw());

    }
}
