package Vladislav.patterns.structural.bridge;

public abstract class Aircraft {
    protected Color color;

    public Aircraft(Color color) {
        this.color = color;
    }

    public Aircraft() {
    }

    abstract public String draw();
}
