package facade.impl2;

/**
 * 子系统
 *
 * @author ShenSha on 2018/11/30
 */
public class CipherMachine {
    public String Encrypt(String plainText) {
        System.out.println("数据加密,将明文转为密文");
        String es = "";
        char[] chars = plainText.toCharArray();
        for (char ch : chars) {
            String c = String.valueOf((ch % 7));
            es+=c;
        }
        System.out.println(es);
        return es;
    }
}
