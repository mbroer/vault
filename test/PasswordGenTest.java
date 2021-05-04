import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordGenTest
{

    @Test
    public void generate() {
        assertEquals(10, PasswordGen.generate(10).length());
    }

    @Test
    public void setIncludeSpecialChars()
    {
        PasswordGen.setIncludeSpecialChars(false);

        for(int i=0;i<10; i++)
            assertFalse(PasswordGen.generate(20).contains("!@#$%^&*()_+{}[];',./<>?|"));
    }
}