import java.util.Scanner;

public class Main
{
    private static final LoginHandler login = LoginHandler.getInstance();

    public static void main (String [] args)
    {
        LoginHandler LH = LoginHandler.getInstance();
        LH.askForLoginUntilCorrect();

        //creates entryvault, automatically reads data.json and populates entryvault.entries, with decrypted passwords
        EntryVault vault = EntryVault.getInstance();
        vault.createEntry("user", "plainpass", "domain", "desc", true);
        vault.listEntries();
    }
}