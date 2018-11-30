package facade.impl1;

/**
 * @author ShenSha on 2018/11/30
 */
public class Facade {
    private SubSystem subSystem = new SubSystem();

    public void watchMovie(){
        subSystem.turnTV();
        subSystem.setCD("末代皇帝");
        subSystem.startWatching();
    }
}
