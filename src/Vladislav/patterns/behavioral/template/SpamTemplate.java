package Vladislav.patterns.behavioral.template;

public interface SpamTemplate {
    default void showspamMessage() {
        System.out.println("Hello, my friend.");
        theme();
        System.out.println("Just go to the link below:\nnelohotron.com");
    }

    void theme();
}
