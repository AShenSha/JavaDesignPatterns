package builder;

public class MINICarBuilder extends CarBuilder {
    @Override
    public void buildWheel() {
        car.setBrake("MINI的刹车");
        System.out.println("MINI的刹车");
    }

    @Override
    public void buildEngine() {
        car.setEngine("报表的引擎");
        System.out.println("MINI的引擎");
    }

    @Override
    public void buildSeat() {
        car.setSeat("MINI的座椅");
    }

    @Override
    public void buildBrake() {
        car.setWheel("MINI的轮子");
    }
}
