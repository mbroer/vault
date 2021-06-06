package start;

import encryption.EncryptionHandler;
import ui.UserInterface;

import java.util.Scanner;

public class LoginHandler
{
    //To make sure user can login to the application, a global masterpassword has to be defined.
    private static final Scanner scan = new Scanner(System.in);
    private final String masterPassword = "ytTy//R2Uy3bdUR5/eopVg==";

    //keep track of user login state
    private boolean isLoggedIn = false;

    private static LoginHandler singleton;

    private LoginHandler()
    {
        UserInterface.addMenuOpt("Logout", this::logout);
    }

    public static LoginHandler getInstance()
    {
        if(singleton == null)
            singleton = new LoginHandler();

        return singleton;
    }

    //handles logging into the application, app wont continue unless correct master password is given
    public void login(String password)
    {
        password = EncryptionHandler.encrypt(password);

        if(password.equals(masterPassword))
        {
            System.out.println("Welkom");
            isLoggedIn = true;
        }
        else
            System.out.println("Incorrect master password.");
    }

    public void askForLoginUntilCorrect()
    {
        while(!isLoggedIn())
        {
            System.out.println("Voer masterpassword in.");
            login(scan.nextLine());
        }
    }

    //logout of the application, requires to re-enter master password
    public void logout()
    {
        isLoggedIn = false;

        askForLoginUntilCorrect();
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
