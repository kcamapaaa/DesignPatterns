package Vladislav.patterns.creational.abstractFactory;

import Vladislav.patterns.creational.abstractFactory.hockeyTeamFactory.HockeyTeamFactory;

public class TorontoHockeyTeam {
    public static void main(String[] args) {
        SportTeamFactory hockeyTeamFactory = new HockeyTeamFactory();
        Midfielder hockeyMidfielder = hockeyTeamFactory.getMidfielder();
        Attacker hockeyAttacker = hockeyTeamFactory.getAttacker();
        Goalkeeper hockeyGoalkeeper = hockeyTeamFactory.getGoalkeeper();

        hockeyGoalkeeper.savingFromGoal();
        hockeyMidfielder.pass();
        hockeyAttacker.hit();
    }
}
