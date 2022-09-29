package Vladislav.patterns.creational.singleton;

public class SimpleSingleton {
    private static SimpleSingleton simpleSingleton;

    private SimpleSingleton() {
    }

    public static synchronized SimpleSingleton getSimpleSingleton() {
        if(simpleSingleton == null) {
            simpleSingleton = new SimpleSingleton();
        }
        return simpleSingleton;
    }

    public void getSum(int a, int b) {
        System.out.println("Result: " + (a + b));
    }

    public void getSubtraction(int a, int b) {
        System.out.println("Result: " + (a - b));
    }

}
