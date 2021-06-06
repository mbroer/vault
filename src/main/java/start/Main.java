package start;

import data.EntryVault;
import passwordgeneration.PasswordGenSpecial;
import ui.UserInterface;

public class Main
{
    private static final LoginHandler loginHandler = LoginHandler.getInstance();

    public static void main (String [] args)
    {
        loginHandler.askForLoginUntilCorrect();

        //** logged in **\\

        //load decrypted vault
        EntryVault.getInstance();

        //start password generator class, adds option in UI.UserInterface
        new PasswordGenSpecial();

        //show UI and start controls
        UserInterface.start();
    }
}