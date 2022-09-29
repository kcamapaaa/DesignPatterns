package Vladislav.patterns.structural.composite;

import java.util.ArrayList;

public class Bag implements Vegitable {
    protected ArrayList<Vegitable> bag = new ArrayList<>();

    void addIntoBag(Vegitable vegitable) {
        bag.add(vegitable);
    }

    void removeFromBag(Vegitable vegitable) {
        bag.remove(vegitable);
    }

    @Override
    public void growVegi() {
        for(Vegitable vegi : bag) {
            vegi.growVegi();
        }
    }
}
