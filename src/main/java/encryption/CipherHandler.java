package encryption;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;

public class CipherHandler
{
    private static Cipher cipher;
    private static Key aesKey;

    private static final String key = "%D*G-KaPdRgUkXp2s5v8y/B?E(H+MbQe"; //256bit

    static
    {
        try
        {
            cipher = Cipher.getInstance("AES");
            aesKey = new SecretKeySpec(key.getBytes(), "AES");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static Key getAESKey()
    {
        return aesKey;
    }

    public static Cipher getCipher()
    {
        return cipher;
    }
}
