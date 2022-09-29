package Vladislav.patterns.creational.abstractFactory.hockeyTeamFactory;

import Vladislav.patterns.creational.abstractFactory.Midfielder;

public class HockeyMidfielder implements Midfielder {
    @Override
    public void pass() {
        System.out.println("Midfielder passed the puck");
    }
}
