public class Main
{
    private static final LoginHandler loginHandler = LoginHandler.getInstance();

    public static void main (String [] args)
    {
        loginHandler.askForLoginUntilCorrect();

        //** logged in **\\

        //load decrypted vault
        EntryVault.getInstance();

        //show UI and start controls
        UserInterface.start();
    }
}