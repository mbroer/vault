public class LoginEntry
{
    //To set and get the username field inside LoginEntry
    private String username;
    //To set and get the password field inside LoginEntry
    private String password;
    //To set and get the domain field inside LoginEntry
    private String domain;
    //To set and get the description field inside LoginEntry
    private String description;


    //LoginEntry constructor creates new LoginEntry object for use in the Vault
    public LoginEntry(String username, String password, String domain, String description)
    {
        this.username = username;
        this.password = password;
        this.domain = domain;
        this.description = description;
    }

    //Sets username of LoginEntry
    public void setUsername(String username)
    {
        this.username = username;
    }

    //returns username of the LoginEntry
    public String getUsername()
    {
        return username;
    }

    //set password of the LoginEntry
    public void setPassword(String password)
    {
        this.password = password;
    }

    //returns password of the LoginEntry
    public String getPassword()
    {
        return password;
    }

    //set domain of the LoginEntry
    public void setDomain(String domain)
    {
        this.domain = domain;
    }

    //returns domain of the LoginEntry
    public String getDomain()
    {
        return domain;
    }

    //set description of the LoginEntry
    public void setDescription(String description)
    {
        this.description = description;
    }

    //returns description of the LoginEntry
    public String getDescription()
    {
        return description;
    }
}
