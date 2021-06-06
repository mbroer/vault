package encryption;

import javax.crypto.Cipher;
import java.util.Base64;

public class DecryptionHandler extends CipherHandler
{
    //decrypt a string
    public static String decrypt(String encoded)
    {
        byte[] decodedBytes = Base64.getDecoder().decode(encoded);
        String decrypted = "";

        try
        {
            getCipher().init(Cipher.DECRYPT_MODE, getAESKey());
            decrypted = new String(getCipher().doFinal(decodedBytes));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return decrypted;
    }
}
