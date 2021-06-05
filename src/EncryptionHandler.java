import javax.crypto.Cipher;
import java.util.Base64;

public class EncryptionHandler
{
    //Cipher to handle encryption

    public static String encrypt(String str)
    {
        byte[] encrypted = {};

        try
        {
            CipherHandler.getCipher().init(Cipher.ENCRYPT_MODE, CipherHandler.getAESKey());
            encrypted = CipherHandler.getCipher().doFinal(str.getBytes());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return Base64.getEncoder().encodeToString(encrypted);
    }
}