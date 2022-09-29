package Vladislav.patterns.creational.prototype;

public class CloneControlRunner {
    public static void main(String[] args) {
        Snake snakeFather = new Snake(1, "father", 2.0);

        System.out.println(snakeFather);

        SnakeFactory factory = new SnakeFactory(snakeFather);
        Snake snakeClone = factory.cloneSnake();

        System.out.println("\n=============================\n");

        System.out.println(snakeClone);
    }
}
