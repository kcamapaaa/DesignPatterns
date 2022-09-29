package Vladislav.patterns.creational.factoryMethod;

public class PorscheCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Porsche();
    }
}
