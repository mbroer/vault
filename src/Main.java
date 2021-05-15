import java.util.Scanner;

public class Main
{
    private static final Scanner scan = new Scanner(System.in);
    private static final LoginHandler login = LoginHandler.getInstance();

    public static void main (String [] args)
    {
        while(!login.isLoggedIn())
        {
            System.out.println("Voer masterpassword in.");
            login.login(scan.nextLine());
        }
    }
}
