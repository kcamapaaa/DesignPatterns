package Vladislav.patterns.creational.abstractFactory.footballTeamFactory;

import Vladislav.patterns.creational.abstractFactory.Midfielder;

public class FootballMidfielder implements Midfielder {
    @Override
    public void pass() {
        System.out.println("Midfielder passed the ball");
    }
}
