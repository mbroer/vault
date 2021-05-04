import java.util.ArrayList;

public class EntryVault
{
    //To keep track of all LoginEntries
    private ArrayList<LoginEntry> entries;

    //Constructor will load-in an arraylist of loginentries
    public EntryVault(ArrayList<LoginEntry> entries) {}

    //Will list all LoginEntry from the entries arraylist
    public void listEntries(){}

    //Handles adding an entry to the vault
    public void addEntry(LoginEntry entry){}

    //Handles removing an entry from the vault
    public void removeEntry(LoginEntry entry){}

    //Handles editing an entry from the vault
    public void editEntry(LoginEntry entry){}

    //returns list of login entries
    public ArrayList<LoginEntry> getEntries()
    {
        return null;
    }
}
