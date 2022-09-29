package Vladislav.patterns.structural.bridge;

public class Boeing extends Aircraft {

    public Boeing(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Boeing was painted into " + color.paint();
    }
}
