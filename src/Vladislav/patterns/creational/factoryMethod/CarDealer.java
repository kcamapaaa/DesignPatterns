package Vladislav.patterns.creational.factoryMethod;

public class CarDealer {
    public static void main(String[] args) {
        CarFactory carFactory = createCarByModel("porsche");
        Car car = carFactory.createCar();
        car.sayModel();
    }

    static CarFactory createCarByModel (String model) {
        if(model.equalsIgnoreCase("BMW")) {
            return new BmwCarFactory();
        }else if(model.equalsIgnoreCase("Porsche")) {
            return new PorscheCarFactory();
        } else if (model.equalsIgnoreCase("Audi")) {
          return new AudiCarFactory();
        } else {
            throw new RuntimeException(model + " is not presented in our shop.");
        }
    }
}
