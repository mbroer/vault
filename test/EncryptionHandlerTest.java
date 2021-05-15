import org.junit.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class EncryptionHandlerTest
{

    @Test
    public void encrypt()
    {
        byte[] encryptedString = encryptedString = EncryptionHandler.encrypt("teststring");

        byte[] expectedOutput = {76, 7, 70, 11, 5, -125, 29, 71, 3, 93, 16, 77, -79, -87, 109, 74};

        String output = EncryptionHandler.byteArrayToString(encryptedString);
        String expected = EncryptionHandler.byteArrayToString(expectedOutput);

        assertEquals(expected, output);
    }

    @Test
    public void decrypt()
    {
        byte[] bytearray = {76, 7, 70, 11, 5, -125, 29, 71, 3, 93, 16, 77, -79, -87, 109, 74};
        String decrypted = EncryptionHandler.decrypt(bytearray);

        assertEquals("teststring", decrypted);
    }
}