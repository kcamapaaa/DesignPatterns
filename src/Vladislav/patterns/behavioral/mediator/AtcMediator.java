package Vladislav.patterns.behavioral.mediator;

public class AtcMediator implements Mediator {
    private Aircraft aircraft;
    private Runway runway;

    private boolean land;

    public void registerRunway(Runway runway) {
        this.runway = runway;
    }

    public void registerAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    @Override
    public void setLandingStatus(boolean land) {
        this.land = land;
    }

    public boolean runwayIfFree() {
        return land;
    }
}
