package command.impl2;


/**
 * 请求调用者
 * @author ShenSha
 */
public class FunctionButton {
    private Command command;
    private String name;

    FunctionButton(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
    public void onClick(){
        System.out.println("点击功能键");
        command.execute();
    }
}
