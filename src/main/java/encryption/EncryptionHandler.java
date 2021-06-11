package encryption;

import javax.crypto.Cipher;
import java.util.Base64;

public class EncryptionHandler extends CipherHandler
{
    //Cipher to handle encryption
    public static String encrypt(String str)
    {
        byte[] encrypted = {};

        try{
            getCipher().init(Cipher.ENCRYPT_MODE, getAESKey());
            encrypted = getCipher().doFinal(str.getBytes());
        }
        catch(Exception e){
            e.printStackTrace();
        }

        return Base64.getEncoder().encodeToString(encrypted);
    }
}