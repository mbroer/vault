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

    @Test
    public void testGeneratorLength()
    {
        int[] badlengths = {0,1,5,51,52};
        int[] goodlengths= {6,7,49,50};

        for(int i=0;i<badlengths.length; i++)
            assertEquals(0, PasswordGen.generate(badlengths[i]).length());

        for(int i=0;i<goodlengths.length; i++)
            assertEquals(goodlengths[i], PasswordGen.generate(goodlengths[i]).length());
    }
}