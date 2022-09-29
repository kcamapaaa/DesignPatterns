package Vladislav.patterns.structural.facade;

public class Referee {
    public boolean isActive;

    public boolean isActiveGame() {
        return isActive;
    }

    public void startGame() {
        System.out.println("The game in progress...");
        isActive = true;
    }

    public void finishGame() {
        System.out.println("The game has finished...");
        isActive = false;
    }
}
