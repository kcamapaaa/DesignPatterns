package Vladislav.patterns.behavioral.mediator;

public class Runner {
    public static void main(String[] args) {
        AtcMediator atcMediator = new AtcMediator();
        Runway runway = new Runway(atcMediator);
        Aircraft aircraft = new Aircraft(atcMediator);

        atcMediator.registerRunway(runway);
        atcMediator.registerAircraft(aircraft);

        aircraft.getReady();
        runway.land();
        aircraft.land();

    }
}
