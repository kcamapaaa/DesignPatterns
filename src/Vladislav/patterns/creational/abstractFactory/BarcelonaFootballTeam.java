package Vladislav.patterns.creational.abstractFactory;

import Vladislav.patterns.creational.abstractFactory.footballTeamFactory.FootballTeamFactory;

public class BarcelonaFootballTeam {

    public static void main(String[] args) {
        SportTeamFactory sportTeamFactory = new FootballTeamFactory();
        Goalkeeper footballGoalkeeper = sportTeamFactory.getGoalkeeper();
        Midfielder footballMidfielder = sportTeamFactory.getMidfielder();
        Attacker footballAttacker = sportTeamFactory.getAttacker();

        System.out.println("Creating a football team Barcelona: ");
        footballGoalkeeper.savingFromGoal();
        footballMidfielder.pass();
        footballAttacker.hit();
    }
}
