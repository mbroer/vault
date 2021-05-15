import javax.crypto.Cipher;
import java.security.Key;
import java.util.Base64;
import javax.crypto.spec.SecretKeySpec;

public class EncryptionHandler
{
    //Cipher to handle encryption
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

    //encrypt a string
    public static String encrypt(String str)
    {
        byte[] encrypted = {};

        try
        {
            cipher.init(Cipher.ENCRYPT_MODE, aesKey);
            encrypted = cipher.doFinal(str.getBytes());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return Base64.getEncoder().encodeToString(encrypted);
    }

    //decrypt a string
    public static String decrypt(String encoded)
    {
        byte[] decodedBytes = Base64.getDecoder().decode(encoded);
        String decrypted = "";

        try
        {
            cipher.init(Cipher.DECRYPT_MODE, aesKey);
            decrypted = new String(cipher.doFinal(decodedBytes));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return decrypted;
    }

    public static String byteArrayToString(byte[] bytes)
    {
        return new String(bytes);
    }

    public static byte[] stringToByteArray(String str)
    {
        return str.getBytes();
    }
}
