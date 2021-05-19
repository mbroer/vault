import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordGenSpecial extends PasswordGenerator
{
    //include special chars in password generator
    final String SPECIAL = "!@#$%^&*()_+{}[];',./<>?|";

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
