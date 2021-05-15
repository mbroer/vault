import java.util.ArrayList;

public class EntryVault
{
    //To keep track of all LoginEntries
    private ArrayList<LoginEntry> entries = new ArrayList<>();

    private static EntryVault singleton;

    //Constructor will load-in an arraylist of loginentries
    private EntryVault()
    {
        FileHandler fileHandler = new FileHandler("data");

        entries = fileHandler.loadDataFromJson();
    }

    public static EntryVault getInstance()
    {
        if(singleton == null)
            singleton = new EntryVault();

        return singleton;
    }

    //Will list all LoginEntry from the entries arraylist
    public void listEntries()
    {
        System.out.printf("%-30.30s  %-30.30s  %-30.30s%n", "LOGINNAAM", "WACHTWOORD", "DOMEIN");

        for(LoginEntry entry : getEntries())
            System.out.printf("%-30.30s  %-30.30s  %-30.30s%n", entry.getUsername(), entry.getPassword(), entry.getDescription());
    }

    public void createEntry(String username, String password, String domain, String description, boolean saveToFile)
    {
        LoginEntry entry = LoginEntry.createNewEntry(username, password, domain, description, saveToFile);

        addEntry(entry);

        if(saveToFile)
        {
            FileHandler FH = new FileHandler("data");
            FH.saveLoginEntryToJson(entry);
        }

    }

    //Handles adding an entry to the vault
    public void addEntry(LoginEntry entry)
    {
        entries.add(entry);
    }

    //Handles removing an entry from the vault
    public void removeEntry(LoginEntry entry){}

    //Handles editing an entry from the vault
    public void editEntry(LoginEntry entry){}

    //returns list of login entries
    public ArrayList<LoginEntry> getEntries()
    {
        return entries;
    }
}
