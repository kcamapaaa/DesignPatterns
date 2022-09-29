package Vladislav.patterns.behavioral.memento;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        BankProject bankProject = new BankProject();
        CareTaker careTaker = new CareTaker();

        bankProject.setArticle("Sberbank");
        System.out.println("Set article as " + bankProject.getArticle());
        Snapshot snapshot = bankProject.saveInSnapshot();
        System.out.println("And save it...");
        careTaker.addSnapshot(snapshot);
        Thread.sleep(2000);

        bankProject.setArticle("Tinkoff");
        System.out.println("Set article as " + bankProject.getArticle());
        Snapshot snapshot1 = bankProject.saveInSnapshot();
        System.out.println("And save it...");
        careTaker.addSnapshot(snapshot1);
        Thread.sleep(2000);

        bankProject.setArticle("GazpromBank");
        System.out.println("Set article as " + bankProject.getArticle());
        Thread.sleep(2000);

        System.out.println("Return back to Tinkoff");
        String article = bankProject.restoreFromSnapshot(careTaker.getSnapshot());
        bankProject.setArticle(article);
        Thread.sleep(2000);

        System.out.println("Bank article: " + bankProject.getArticle());
    }
}
