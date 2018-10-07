package builder;

public abstract class CarBuilder {
    protected Car car;

    public Car getCar() {
        return car;
    }

    public void buildCar() {
        Car car = new Car();
        System.out.println("创建了一辆车");
    }

    abstract public void buildWheel();

    abstract public void buildEngine();

    abstract public void buildSeat();

    abstract public void buildBrake();
}
