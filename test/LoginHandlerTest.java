import static org.junit.Assert.*;

public class LoginHandlerTest
{
    @org.junit.Test
    public void login()
    {
        LoginHandler loginHandler = new LoginHandler();
        loginHandler.login("masterpassword");

        assertTrue(loginHandler.isLoggedIn());
    }

    @org.junit.Test
    public void isLoggedIn()
    {
        LoginHandler loginHandler = new LoginHandler();
        assertFalse(loginHandler.isLoggedIn());
    }
}