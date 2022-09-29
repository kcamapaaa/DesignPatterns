package Vladislav.patterns.behavioral.mediator;

public class Aircraft implements Land {
    AtcMediator atcMediator;

    public Aircraft(AtcMediator atcMediator) {
        this.atcMediator = atcMediator;
    }

    @Override
    public void land() {
        System.out.println(atcMediator.runwayIfFree() ? "Cleared to land" : "Continue approach");
    }

    public void getReady() {
        System.out.println("Ready to land");
    }
}
