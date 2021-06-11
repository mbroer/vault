package data;

import java.util.ArrayList;

import ui.UserInterface;

public class EntryVault
{
    //To keep track of all LoginEntries
    private ArrayList<LoginEntry> entries = new ArrayList<>();

    private static EntryVault singleton;

    //Constructor will load-in an arraylist of loginentries
    private EntryVault()
    {
        UserInterface.addMenuOpt("Toon login gegevens", this::listEntries);
        UserInterface.addMenuOpt("Voeg login gegevens toe", this::createEntryUser);

        FileHandler fileHandler = new FileHandler("data");

        entries = fileHandler.loadDataFromJson();
    }

    public static EntryVault getInstance()
    {
        if(singleton == null)
            singleton = new EntryVault();

        return singleton;
    }

    //Will list all Data.LoginEntry from the entries arraylist
    public void listEntries()
    {
        String column = "%-30.30s  %-30.30s %-30.30s %-30.30s%n";

        System.out.printf(column, "LOGINNAAM", "WACHTWOORD", "DOMEIN", "BESCHRIJVING");

        for(LoginEntry entry : getEntries())
            System.out.printf(column, entry.getUsername(), entry.getPassword(), entry.getDomain(), entry.getDescription());
    }

    public void createEntryUser()
    {
        String username = UserInterface.getScannerResult("Voer loginnaam in", true);
        String password = UserInterface.getScannerResult("Voer wachtwoord in", true);
        String domain = UserInterface.getScannerResult("Voer domein in", false);
        String description = UserInterface.getScannerResult("Voer beschrijving in", false);

        createEntry(username, password, domain, description);
        System.out.println("Gegevens toegevoegd.");
    }

    public void createEntry(String username, String password, String domain, String description)
    {
        LoginEntry entry = LoginEntry.createNewEntry(username, password, domain, description);

        addEntry(entry);

        FileHandler FH = new FileHandler("data");
        FH.saveLoginEntryToJson(entry);
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
