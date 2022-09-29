package Vladislav.patterns.creational.abstractFactory.hockeyTeamFactory;

import Vladislav.patterns.creational.abstractFactory.Goalkeeper;

public class HockeyGoalkeeper implements Goalkeeper {
    @Override
    public void savingFromGoal() {
        System.out.println("Goalkeeper caught the puck");
    }
}
