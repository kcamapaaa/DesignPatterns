package Vladislav.patterns.behavioral.visitor;

public class AdvancedWriter implements Writer {
    @Override
    public void create(Title title) {
        System.out.println("Nice title");
    }

    @Override
    public void create(Colomn colomn) {
        System.out.println("Awesome colomn");
    }
}
