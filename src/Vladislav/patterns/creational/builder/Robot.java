package Vladislav.patterns.creational.builder;

public class Robot {
    private String name;
    private Type type;
    private int cost;

    public void setName(String name) {
        this.name = name;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", cost=" + cost +
                '}';
    }
}
