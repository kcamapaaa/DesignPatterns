package Vladislav.patterns.creational.abstractFactory.footballTeamFactory;

import Vladislav.patterns.creational.abstractFactory.Attacker;
import Vladislav.patterns.creational.abstractFactory.Goalkeeper;
import Vladislav.patterns.creational.abstractFactory.Midfielder;
import Vladislav.patterns.creational.abstractFactory.SportTeamFactory;

public class FootballTeamFactory implements SportTeamFactory {
    @Override
    public Goalkeeper getGoalkeeper() {
        return new FootballGoalkeeper();
    }

    @Override
    public Attacker getAttacker() {
        return new FootballAttacker();
    }

    @Override
    public Midfielder getMidfielder() {
        return new FootballMidfielder();
    }
}
