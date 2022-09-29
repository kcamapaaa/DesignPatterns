package Vladislav.patterns.behavioral.strategy;

public class WritingState implements EmailState {
    @Override
    public void getStatus() {
        System.out.println("Writing email.");
    }
}
