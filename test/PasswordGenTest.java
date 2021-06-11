import passwordgeneration.PasswordGenSpecial;
import org.junit.Test;

import static org.junit.Assert.*;


public class PasswordGenTest
{
    @Test
    public void generate() {
        PasswordGenSpecial passwordGen = new PasswordGenSpecial();

        //assertEquals(6, passwordGen.createPassword(6).length());
        //assertEquals(0, passwordGen.createPassword(5).length());
    }

    @Test
    public void setIncludeSpecialChars()
    {
        PasswordGenSpecial passwordGen = new PasswordGenSpecial();

        String password;

        for(int i=0;i<10; i++)
        {
            //password = passwordGen.createPassword(6);
            //assertTrue(passwordGen.containsSpecChar(password));
        }
    }

    @Test
    public void testGeneratorLength()
    {
        int[] badlengths = {0,1,5,51,52};
        int[] goodlengths= {6,7,49,50};

        PasswordGenSpecial passwordGen = new PasswordGenSpecial();

        //for(int i=0;i<badlengths.length; i++)
        //    assertEquals(0, passwordGen.createPassword(badlengths[i]).length());

        //for(int i=0;i<goodlengths.length; i++)
        //    assertEquals(goodlengths[i], passwordGen.createPassword(goodlengths[i]).length());
    }
}