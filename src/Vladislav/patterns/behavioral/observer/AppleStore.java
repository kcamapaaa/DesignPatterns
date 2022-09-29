package Vladislav.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class AppleStore implements Observed{
    List<Observer> subscribers = new ArrayList<>();
    List<String> assortment = new ArrayList<>();

    public void addItemToStore(String item) {
        assortment.add(item);
        notifyEveryone();
    }

    public void removeItemFromStore(String item) {
        assortment.remove(item);
        notifyEveryone();
    }

    @Override
    public void addObserver(Observer observer) {
        subscribers.add(observer);
        System.out.println("New subscriber was added!");
    }

    @Override
    public void removeObserver(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyEveryone() {
        subscribers.forEach(x -> x.handleEvent(assortment));
    }
}
