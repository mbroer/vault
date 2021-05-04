import javax.crypto.Cipher;
import javax.crypto.SecretKey;

public class EncryptionHandler
{
    //Cipher to handle encryption
    private Cipher cipher;

    //To generate a key
    private SecretKey secretKey;

    //To easily change which scheme to use for encryption/decryption
    private String encryptionScheme;

    //encrypt a given string
    public String encrypt(String str)
    {
        return "";
    }

    //decrypt a given string
    public String decrypt(String str)
    {
        return "";
    }
}
