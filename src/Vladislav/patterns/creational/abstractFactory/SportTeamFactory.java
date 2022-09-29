package Vladislav.patterns.creational.abstractFactory;

public interface SportTeamFactory {
    Goalkeeper getGoalkeeper();
    Attacker getAttacker();
    Midfielder getMidfielder();
}
