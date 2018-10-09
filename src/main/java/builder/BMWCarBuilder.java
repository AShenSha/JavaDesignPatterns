package builder;

public class BMWCarBuilder extends CarBuilder {
    @Override
    public void buildWheel() {
        car.setWheel("轮子");
        System.out.println("宝马的轮子");
    }

    @Override
    public void buildEngine() {
        car.setEngine("报表的引擎");
        System.out.println("宝马的引擎");
    }

    @Override
    public void buildSeat() {
        car.setSeat("宝马的座椅");
        System.out.println("宝马的座椅");
    }

    @Override
    public void buildBrake() {
        car.setBrake("换轮子");
        System.out.println("宝马的刹车");
    }
}
