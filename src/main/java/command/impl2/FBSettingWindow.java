package command.impl2;

import java.util.ArrayList;

/**
 * 功能键设置按键类
 *
 * @author ShenSha
 */
public class FBSettingWindow {
    private String title;
    private ArrayList<FunctionButton> buttons = new ArrayList<FunctionButton>();

    public FBSettingWindow(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addFunctionButton(FunctionButton button) {
        buttons.add(button);
    }

    public void removeFunctionButton(FunctionButton button) {
        buttons.remove(button);
    }

    public void display() {
        System.out.println("显示窗口:" + this.title);
        System.out.println("显示功能键");
        for (FunctionButton button : buttons) {
            System.out.println(button.getName());
        }
        System.out.println("----------------------------");
    }
}
