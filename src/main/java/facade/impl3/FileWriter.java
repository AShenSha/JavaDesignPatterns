package facade.impl3;

import java.io.*;

/**
 * @author ShenSha on 2018/11/30
 */
public class FileWriter {
    public void write(String encryptStr, String fileNameDes) {
        System.out.println("保存密文,写入文件");
        File file = new File(fileNameDes);
        OutputStream os = null;
        try {
            os = new FileOutputStream(file);
            byte[] b = encryptStr.getBytes();
            os.write(b);
            os.flush();
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
