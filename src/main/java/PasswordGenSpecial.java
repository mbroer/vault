import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordGenSpecial extends PasswordGenerator
{
    //include special chars in password generator
    final String SPECIAL = "!@#$%^&*()_+{}[];',./<>?|";

    public PasswordGenSpecial()
    {
        UserInterface.addMenuOpt("Wachtwoord genereren", this::userCreatePassword);
    }

    public void userCreatePassword()
    {
        int length = Integer.parseInt( UserInterface.getScannerResult("Uit hoeveel tekens moet het wachtwoord bestaan?", true) );

        System.out.println("Gegenereerde wachtwoord:\n"+createPassword(length));
    }

    @Override
    StringBuilder addSpecialCharacters(StringBuilder str)
    {
        return str.append(SPECIAL);
    }

    @Override
    boolean containsSpecChar(String str)
    {
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher = pattern.matcher(str);

        return matcher.find();
    }

    boolean includeSpecialCharacters()
    {
        return true;
    }
}
