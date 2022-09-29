package Vladislav.patterns.creational.abstractFactory.hockeyTeamFactory;

import Vladislav.patterns.creational.abstractFactory.Attacker;
import Vladislav.patterns.creational.abstractFactory.Goalkeeper;
import Vladislav.patterns.creational.abstractFactory.Midfielder;
import Vladislav.patterns.creational.abstractFactory.SportTeamFactory;

public class HockeyTeamFactory implements SportTeamFactory {
    @Override
    public Goalkeeper getGoalkeeper() {
        return new HockeyGoalkeeper();
    }

    @Override
    public Attacker getAttacker() {
        return new HockeyAttacker();
    }

    @Override
    public Midfielder getMidfielder() {
        return new HockeyMidfielder();
    }
}
