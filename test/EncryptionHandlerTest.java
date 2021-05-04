import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptionHandlerTest
{

    @Test
    public void encrypt() {
        EncryptionHandler encryptor = new EncryptionHandler();
        assertEquals("", encryptor.encrypt("asd"));
    }

    @Test
    public void decrypt() {
        EncryptionHandler encryptor = new EncryptionHandler();
        assertEquals("", encryptor.decrypt("asd"));
    }
}