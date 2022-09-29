package Vladislav.patterns.behavioral.observer;

public class Runner {
    public static void main(String[] args) {
        AppleStore appleStore = new AppleStore();
        appleStore.addItemToStore("Iphone 11 Pro");
        appleStore.addItemToStore("Ipad Pro");
        appleStore.addItemToStore("MacBook Air");

        Client vasya = new Client("Vasya Pupkin");
        Client gleb = new Client("Gleb Sergeev");
        Client vova = new Client("Oleg Kozhemyaka");

        appleStore.addObserver(vasya);
        appleStore.addObserver(gleb);
        appleStore.addObserver(vova);

        appleStore.addItemToStore("Iphone 14 Pro Max 1Tb");
        appleStore.addItemToStore("Apple Watch 8");

        appleStore.removeItemFromStore("Iphone 11 Pro");
    }
}
