package facade.impl3;

/**
 * @author ShenSha on 2018/12/3
 */
public class EncryptFacade extends AbstractEncryptFacade {
    private FileReader reader;
    private NewCipherMachine newCipherMachine;
    private FileWriter fileWriter;

    public EncryptFacade(){
        reader = new FileReader();
        newCipherMachine = new NewCipherMachine();
        fileWriter = new FileWriter();
    }

    @Override
    public void FileEncrypt(String fileFrom, String fileTo) {
        String plainStr = reader.read(fileFrom);
        String encryptStr = newCipherMachine.Encrypt(plainStr);
        fileWriter.write(encryptStr, fileTo);
    }
}
