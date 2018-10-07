package builder;

public class Director {
    private CarBuilder carBuilder;

    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car getCar(){
        return carBuilder.getCar();
    }

    public void constructCar(){
        carBuilder.buildBrake();
        carBuilder.buildCar();
        carBuilder.buildEngine();
        carBuilder.buildSeat();
        carBuilder.buildWheel();
    }
}
