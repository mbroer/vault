import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptionHandlerTest
{

    @Test
    public void encrypt()
    {
        String encryptedString = EncryptionHandler.encrypt("teststring");

        assertEquals("TAdGCwWDHUcDXRBNsaltSg==", encryptedString);
    }

    @Test
    public void decrypt()
    {
        String decryptedString = DecryptionHandler.decrypt("TAdGCwWDHUcDXRBNsaltSg==");

        assertEquals(decryptedString, "teststring");
    }
}