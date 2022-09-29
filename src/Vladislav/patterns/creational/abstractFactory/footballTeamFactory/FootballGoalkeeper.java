package Vladislav.patterns.creational.abstractFactory.footballTeamFactory;

import Vladislav.patterns.creational.abstractFactory.Goalkeeper;

public class FootballGoalkeeper implements Goalkeeper {
    @Override
    public void savingFromGoal() {
        System.out.println("Goalkeeper caught the ball");
    }
}
