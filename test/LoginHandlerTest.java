import start.LoginHandler;

import static org.junit.Assert.*;

public class LoginHandlerTest
{
    @org.junit.Test
    public void login()
    {
        LoginHandler loginHandler = LoginHandler.getInstance();
        loginHandler.login("masterpassword");

        assertTrue(loginHandler.isLoggedIn());
    }

    @org.junit.Test
    public void isLoggedIn()
    {
        LoginHandler loginHandler = LoginHandler.getInstance();
        loginHandler.logout();
        assertFalse( loginHandler.isLoggedIn() );
    }
}