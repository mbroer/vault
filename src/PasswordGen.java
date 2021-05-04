import java.security.SecureRandom;

public class PasswordGen
{
    //include uppercase chars in password generator
    private static final String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    //include lowercase chars in password generator
    private static final String LCCHARS = CHARS.toLowerCase();
    //include number chars in password generator
    private static final String NUMS = "0123456789";
    //include special chars in password generator
    private static final String SPECIAL = "!@#$%^&*()_+{}[];',./<>?|";
    //boolean to toggle if password generator should use special characters
    private static boolean includeSpecialChars = true;
    //SecureRandom for security
    private static SecureRandom random = new SecureRandom();

    //generates a random string with specified length
    public static String generate(int length)
    {
        if(length < 6)
            return "";
        else if(length > 50)
            return "";

        StringBuilder str = new StringBuilder();
        str.append(CHARS).append(LCCHARS).append(NUMS);

        if(getIncludeSpecialChars())
            str.append(SPECIAL);

        StringBuilder shuffled = new StringBuilder();

        for (int i = 0; i < str.length(); i++)
        {
            int index = random.nextInt(str.length());
            shuffled.append(str.charAt(index));
        }

        return shuffled.substring(0, length).toString();
    }

    //allows user to toggle special characters on and off for password generator
    public static void setIncludeSpecialChars(boolean bool)
    {
        includeSpecialChars = bool;
    }

    //returns if passwordgen should use special characters in generate()
    public static boolean getIncludeSpecialChars()
    {
        return includeSpecialChars;
    }
}
