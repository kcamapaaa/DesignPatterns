package Vladislav.patterns.creational.abstractFactory.footballTeamFactory;

import Vladislav.patterns.creational.abstractFactory.Attacker;

public class FootballAttacker implements Attacker {
    @Override
    public void hit() {
        System.out.println("Attacker scored the ball");
    }
}
