package Vladislav.patterns.behavioral.iterator;

public class Runner {
    public static void main(String[] args) {
        String[] skills = {"Shooting", "Speed", "Passing", "Attack", "Dribbling"};
        Footballer footballer = new Footballer("Anton Bober", skills);

        System.out.println("Footballer " + footballer.getName() + " has skills: ");
        Iterator iterator = footballer.getIterator();

        while(iterator.hasNext()) {
            System.out.print(iterator.next().toString() + " ");
        }
    }
}
