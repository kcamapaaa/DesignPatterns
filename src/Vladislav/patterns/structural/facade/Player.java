package Vladislav.patterns.structural.facade;

public class Player {
    public void playGameBeforeEnds(Referee referee) {
        if(referee.isActive) {
            System.out.println("Players are enjoying the game...");
        } else {
            System.out.println("Players left the pitch and went home...");
        }
    }


}
