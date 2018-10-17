package prototype.impl2.shallowClone;

/**
 * 附件类
 * @author ShenSha
 */
public class Attachment {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void download(){
        System.out.println("下载文件,文件名为:"+name);
    }
}
