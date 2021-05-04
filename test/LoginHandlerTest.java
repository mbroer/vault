import static org.junit.Assert.*;

public class LoginHandlerTest
{
    @org.junit.Test
    public void login()
    {
        LoginHandler loginHandler = new LoginHandler();
        loginHandler.login("p");

        assertTrue(loginHandler.isLoggedIn());
    }

    @org.junit.Test
    public void isLoggedIn()
    {
        LoginHandler loginHandler = new LoginHandler();
        assertFalse(loginHandler.isLoggedIn());
    }
}