package Vladislav.patterns.creational.prototype;

public class SnakeFactory {
    Snake snake;

    public SnakeFactory(Snake snake) {
        this.snake = snake;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    Snake cloneSnake() {
        return (Snake) snake.copy();
    }
}
