package Vladislav.patterns.creational.prototype;

public class Snake implements Copyable {
    private int id;
    private String name;
    private double length;

    public Snake(int id, String name, double length) {
        this.id = id;
        this.name = name;
        this.length = length;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public Object copy() {
        Snake copy = new Snake(id, name, length);
        return copy;
    }

    @Override
    public String toString() {
        return "Snake{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", length=" + length +
                '}';
    }
}
