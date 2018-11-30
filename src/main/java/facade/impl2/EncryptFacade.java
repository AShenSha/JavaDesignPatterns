package facade.impl2;

import java.io.File;

/**
 * @author ShenSha on 2018/11/30
 */
public class EncryptFacade {
    private FileReader reader;
    private CipherMachine cipherMachine;
    private FileWriter fileWriter;

    public EncryptFacade(){
        reader = new FileReader();
        cipherMachine = new CipherMachine();
        fileWriter = new FileWriter();
    }
    public void FileEncrypt(String fileFrom, String fileTo)
    {
        String plainStr = reader.read(fileFrom);
        String encryptStr = cipherMachine.Encrypt(plainStr);
        fileWriter.write(encryptStr, fileTo);
    }
}
