import java.util.ArrayList;
import static org.junit.Assert.*;

public class EntryVaultTest
{

    public void addEntry()
    {
        ArrayList<LoginEntry> entries = new ArrayList<>();
        EntryVault vault = new EntryVault(entries);

        LoginEntry entry = new LoginEntry("username", "password", "domain", "description");
        vault.addEntry(entry);

        assertEquals(1, vault.getEntries().size());
    }
}