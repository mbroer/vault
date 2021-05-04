public class LoginHandler
{
    //To make sure user can login to the application, a global masterpassword has to be defined.
    private String masterPassword = "masterpassword";

    //keep track of user login state
    private boolean isLoggedIn = false;

    //handles logging into the application, app wont continue unless correct master password is given
    public void login(String password)
    {
        if(password.equals(masterPassword))
            isLoggedIn = true;
    }

    //logout of the application, requires to re-enter master password
    public void logout()
    {
    }

    //function to check if user is actually logged in
    public boolean isLoggedIn()
    {
        return isLoggedIn;
    }

    //quit the application
    public void exit()
    {
    }
}
