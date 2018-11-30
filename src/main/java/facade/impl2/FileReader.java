package facade.impl2;


import java.io.*;

/**
 * @author ShenSha on 2018/11/30
 */
public class FileReader {
    public String read(String filePath) {
        System.out.println("读取文件,读取明文:");
        File file = new File(filePath);
        StringBuilder sb = new StringBuilder();
        try {
            InputStreamReader reader = null;
            reader = new InputStreamReader(new FileInputStream(file));
            BufferedReader br = new BufferedReader(reader);
            String lineText = null;
            while ((lineText = br.readLine()) != null) {
                sb.append(lineText);
            }
            br.close();
            System.out.println(sb);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
