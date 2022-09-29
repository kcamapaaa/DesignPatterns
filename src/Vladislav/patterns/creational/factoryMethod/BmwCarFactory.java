package Vladislav.patterns.creational.factoryMethod;

public class BmwCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Bmw();
    }
}
