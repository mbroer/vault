import org.junit.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class EncryptionHandlerTest
{

    @Test
    public void encrypt()
    {
        String encryptedString = encryptedString = EncryptionHandler.encrypt("teststring");

        assertEquals("TAdGCwWDHUcDXRBNsaltSg==", encryptedString);
    }

    @Test
    public void decrypt()
    {
        String decryptedString = EncryptionHandler.decrypt("TAdGCwWDHUcDXRBNsaltSg==");

        assertEquals(decryptedString, "teststring");
    }
}