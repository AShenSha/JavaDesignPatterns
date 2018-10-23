package command.impl2;

/**
 * @author ShenSha
 */
public class Client {
    public static void main(String[] args) {
        FBSettingWindow fbSettingWindow = new FBSettingWindow("功能键设置");
        FunctionButton fb1,fb2;
        fb1 = new FunctionButton("功能键1");
        fb2 = new FunctionButton("功能键2");
        Command c1,c2;
        //通过配置文件和反射生成具体命令对象
        c1 = (Command) XMLUtil.getBean(0);
        c2 = (Command) XMLUtil.getBean(1);

        fb1.setCommand(c1);
        fb2.setCommand(c2);

        fbSettingWindow.addFunctionButton(fb1);
        fbSettingWindow.addFunctionButton(fb2);
        fbSettingWindow.display();
        fb1.onClick();
        fb2.onClick();
    }
}
