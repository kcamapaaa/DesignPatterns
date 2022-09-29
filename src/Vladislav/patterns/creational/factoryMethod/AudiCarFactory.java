package Vladislav.patterns.creational.factoryMethod;

public class AudiCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Audi();
    }
}
