import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest
{
    @Test
    public void testMCDC()
    {

        LoginHandler LH = LoginHandler.getInstance();
        LH.login("masterpassword");         //login with master password

        LoginEntry LE = new LoginEntry("username", "pass", "domain", "desc");

        assertTrue(LH.isLoggedIn());                //masterpassword entered correctly / user logged in
        assertTrue(!LE.getUsername().isEmpty());    //username field filled
        assertTrue(!LE.getPassword().isEmpty());    //password field filled
    }
}
