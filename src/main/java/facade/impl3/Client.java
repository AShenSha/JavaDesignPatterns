package facade.impl3;

import javax.security.auth.login.Configuration;

/**
 * @author ShenSha on 2018/12/3
 */
public class Client {
    public static void main(String[] args) {
        AbstractEncryptFacade abstractEncryptFacade = new EncryptFacade();
        abstractEncryptFacade.FileEncrypt("c://a.txt","c://b.txt");
    }
}
