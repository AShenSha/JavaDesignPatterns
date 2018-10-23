package command.impl1;

public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Light light = new Light();
        Command c1 = new LightOnCommand(light);
        Command c2 = new LightOffCommand(light);
        invoker.setOnCommand(c1,0);
        invoker.setOffCommand(c2,0);
        invoker.onButtonWasPushed(0);
        invoker.offButtonWasPushed(0);
    }
}
