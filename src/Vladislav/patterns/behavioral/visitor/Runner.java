package Vladislav.patterns.behavioral.visitor;

public class Runner {
    public static void main(String[] args) {
        NewsPaper newsPaper = new NewsPaper();

        BeginnerWriter beginner = new BeginnerWriter();
        AdvancedWriter advanced = new AdvancedWriter();

        newsPaper.beWritten(beginner);

        System.out.println("\n===================\n");

        newsPaper.beWritten(advanced);
    }
}
