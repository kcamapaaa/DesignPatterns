package Vladislav.patterns.structural.composite;

public class AppRunner {
    public static void main(String[] args) {
        Bag bag = new Bag();
        Bag bag1 = new Bag();
        Bag bag2 = new Bag();
        Bag bag3 = new Bag();

        Carrot carrot = new Carrot();
        Carrot carrot1 = new Carrot();
        Carrot carrot2 = new Carrot();

        Cucumber cucumber = new Cucumber();
        Cucumber cucumber1 = new Cucumber();
        Cucumber cucumber2 = new Cucumber();
        Cucumber cucumber3 = new Cucumber();

        Tomato tomato = new Tomato();
        Tomato tomato1 = new Tomato();
        Tomato tomato2 = new Tomato();
        Tomato tomato3 = new Tomato();
        Tomato tomato4 = new Tomato();
        Tomato tomato5 = new Tomato();
        Tomato tomato6 = new Tomato();
        Tomato tomato7 = new Tomato();

        bag1.addIntoBag(carrot);
        bag1.addIntoBag(carrot1);
        bag1.addIntoBag(cucumber1);
        bag1.addIntoBag(cucumber3);
        bag1.addIntoBag(tomato2);
        bag1.addIntoBag(tomato6);

        bag2.addIntoBag(cucumber2);
        bag2.addIntoBag(tomato3);
        bag2.addIntoBag(tomato7);
        bag2.addIntoBag(tomato5);
        bag2.addIntoBag(tomato);

        bag3.addIntoBag(carrot2);
        bag3.addIntoBag(cucumber);
        bag3.addIntoBag(tomato1);
        bag3.addIntoBag(tomato4);

        bag.addIntoBag(bag1);
        bag.addIntoBag(bag2);
        bag.addIntoBag(bag3);

        bag.growVegi();
    }
}
