package Vladislav.patterns.structural.bridge;

public class Airbus extends Aircraft {
    public Airbus(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Airbus was painted into " + color.paint();
    }
}
