package Vladislav.patterns.creational.abstractFactory.hockeyTeamFactory;

import Vladislav.patterns.creational.abstractFactory.Attacker;

public class HockeyAttacker implements Attacker {
    @Override
    public void hit() {
        System.out.println("Attacker scored the puck");
    }
}
