package prototype.impl2.deepClone;

import java.io.Serializable;

/**
 * 附件类
 * @author ShenSha
 */
public class Attachment implements Serializable {
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
