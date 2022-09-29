package Vladislav.patterns.structural.facade;

public class GameFlow {
    Game game = new Game();
    Player player = new Player();
    Referee referee = new Referee();

    public void fullMatch() {
        game.playingGame();
        referee.startGame();
        player.playGameBeforeEnds(referee);
        referee.finishGame();
        player.playGameBeforeEnds(referee);
    }
}
