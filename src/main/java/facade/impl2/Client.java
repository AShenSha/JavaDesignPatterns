package facade.impl2;

/**
 * @author ShenSha on 2018/11/30
 */
public class Client {
    public static void main(String[] args) {
        EncryptFacade facade = new EncryptFacade();
        facade.FileEncrypt("c://a.txt","c://b.txt");
    }
}
