import javax.crypto.Cipher;
import java.util.Base64;

public class DecryptionHandler
{
    //decrypt a string
    public static String decrypt(String encoded)
    {
        byte[] decodedBytes = Base64.getDecoder().decode(encoded);
        String decrypted = "";

        try
        {
            CipherHandler.getCipher().init(Cipher.DECRYPT_MODE, CipherHandler.getAESKey());
            decrypted = new String(CipherHandler.getCipher().doFinal(decodedBytes));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return decrypted;
    }
}
