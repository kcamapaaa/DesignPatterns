package Vladislav.patterns.behavioral.mediator;

public class Runway implements Land {
    AtcMediator atcMediator;

    public Runway(AtcMediator atcMediator) {
        this.atcMediator = atcMediator;
        atcMediator.setLandingStatus(true);
    }

    @Override
    public void land() {
        System.out.println("Runway is free");
    }
}
