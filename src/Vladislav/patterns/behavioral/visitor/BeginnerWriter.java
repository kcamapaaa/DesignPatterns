package Vladislav.patterns.behavioral.visitor;

public class BeginnerWriter implements Writer {
    @Override
    public void create(Title title) {
        System.out.println("Not a good title");
    }

    @Override
    public void create(Colomn colomn) {
        System.out.println("Ok, but not perfect");
    }
}
