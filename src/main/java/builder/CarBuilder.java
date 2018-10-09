package builder;

public abstract class CarBuilder {
    protected Car car;

    public Car getCar() {
        return car;
    }

    public void buildCar() {
        car = new Car();
        System.out.println("创建了一辆车");
    }

    /**
     * 创建轮子
     */
    abstract public void buildWheel();

    /**
     * 创建引擎
     */
    abstract public void buildEngine();

    /**
     * 创建座位
     */
    abstract public void buildSeat();

    /**
     * 创建刹车
     */
    abstract public void buildBrake();
}
