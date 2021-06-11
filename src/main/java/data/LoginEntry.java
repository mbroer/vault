package data;

public class LoginEntry
{
    //To set and get the username field inside Data.LoginEntry
    private String username;
    //To set and get the password field inside Data.LoginEntry
    private String password;
    //To set and get the domain field inside Data.LoginEntry
    private String domain;
    //To set and get the description field inside Data.LoginEntry
    private String description;

    //Data.LoginEntry constructor creates new Data.LoginEntry object for use in the Vault
    public LoginEntry(String username, String password, String domain, String description)
    {

        this.username = username;
        this.password = password;
        this.domain = domain;
        this.description = description;
    }

    /*
        wrapper to create new entry, returns false if given incorrect input,
        returns true and creates new entry if correct inputs are supplied
    */
    public static LoginEntry createNewEntry(String username, String password, String domain, String description)
    {
        if(username.isEmpty() || password.isEmpty())
            return null;

        LoginEntry entry = new LoginEntry(username, password, domain, description);

        return entry;
    }

    public static LoginEntry createNewEntry(Integer username, String password, String domain, String description)
    {
        return createNewEntry(username.toString(), password, domain, description);
    }

    //Sets username of Data.LoginEntry
    public void setUsername(String username)
    {
        this.username = username;
    }

    //returns username of the Data.LoginEntry
    public String getUsername()
    {
        return username;
    }

    //set password of the Data.LoginEntry
    public void setPassword(String password)
    {
        this.password = password;
    }

    //returns password of the Data.LoginEntry
    public String getPassword()
    {
        return password;
    }

    //set domain of the Data.LoginEntry
    public void setDomain(String domain)
    {
        this.domain = domain;
    }

    //returns domain of the Data.LoginEntry
    public String getDomain()
    {
        return domain;
    }

    //set description of the Data.LoginEntry
    public void setDescription(String description)
    {
        this.description = description;
    }

    //returns description of the Data.LoginEntry
    public String getDescription()
    {
        return description;
    }
}
