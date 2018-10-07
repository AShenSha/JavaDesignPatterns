package builder;

public class BMWCarBuilder extends CarBuilder {
    @Override
    public void buildWheel() {
        car.setBrake("宝马的刹车");
        System.out.println("宝马的刹车");
    }

    @Override
    public void buildEngine() {
        car.setEngine("报表的引擎");
        System.out.println("宝马的引擎");
    }

    @Override
    public void buildSeat() {
        car.setSeat("宝马的座椅");
    }

    @Override
    public void buildBrake() {
        car.setWheel("宝马的轮子");
    }
}
