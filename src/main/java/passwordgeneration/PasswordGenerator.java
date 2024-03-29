package passwordgeneration;

import java.security.SecureRandom;

public abstract class PasswordGenerator
{
    //include uppercase chars in password generator
    final String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    //include lowercase chars in password generator
    final String LCCHARS = CHARS.toLowerCase();
    //include number chars in password generator
    final String NUMS = "0123456789";

    private SecureRandom random = new SecureRandom();

    final String createPassword(int length)
    {
        if( length < 6 || length > 50)
            return "";

        StringBuilder password = new StringBuilder();

        password = addAllCharacters(password);
        password = shuffle(password);

        String stringPassword = password.substring(0, length);

        //TEMPLATE METHOD
        //if special chars are wanted but none are found recreate password.
        if(includeSpecialCharacters())
            if(!containsSpecChar(stringPassword))
                return createPassword(length);

        return stringPassword;
    }

    private StringBuilder addAllCharacters(StringBuilder password)
    {
        password = addUpperCaseCharacters(password);
        password = addLowerCaseCharacters(password);
        password = addNumCharacters(password);

        //TEMPLATE METHOD
        if(includeSpecialCharacters())
            password = addSpecialCharacters(password);

        return password;
    }


    abstract StringBuilder addSpecialCharacters(StringBuilder str);
    abstract boolean containsSpecChar(String str);

    private StringBuilder addUpperCaseCharacters(StringBuilder str)
    {
        return str.append(CHARS);
    }

    private StringBuilder addLowerCaseCharacters(StringBuilder str)
    {
        return str.append(LCCHARS);
    }

    private StringBuilder addNumCharacters(StringBuilder str)
    {
        return str.append(NUMS);
    }

    private StringBuilder shuffle(StringBuilder str)
    {
        StringBuilder shuffled = new StringBuilder();

        for (int i = 0; i < str.length(); i++)
        {
            int index = random.nextInt(str.length());
            shuffled.append(str.charAt(index));
        }

        return shuffled;
    }

    boolean includeSpecialCharacters()
    {
        return false;
    }

    boolean includeUpperCaseCharacters()
    {
        return true;
    }
}