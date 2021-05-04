import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest
{
    @Test
    public void testMCDC()
    {
        LoginHandler LH = new LoginHandler();
        LH.login("masterpassword");

        LoginEntry LE = new LoginEntry("username", "pass", "domain", "desc");

        assertTrue(LH.isLoggedIn());
        assertTrue(!LE.getUsername().isEmpty());
        assertTrue(!LE.getPassword().isEmpty());
    }
}