package builder;

public class ComputerCustomer {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new BMWCarBuilder();
        director.setCarBuilder(carBuilder);
        director.constructCar();
        Car car = director.getCar();
    }
}
