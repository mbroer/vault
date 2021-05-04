import org.junit.Test;


import static org.junit.Assert.*;

public class LoginEntryTest
{

    private static LoginEntry entry = new LoginEntry("username", "pw", "domain", "desc");

    @Test
    public void setUsername() {
        entry.setUsername("name");
        assertEquals("name", entry.getUsername());
    }

    @Test
    public void getUsername() {
        assertEquals("name", entry.getUsername());
    }

    @Test
    public void setPassword() {
        entry.setPassword("pass");
        assertEquals("pass", entry.getPassword());
    }

    @Test
    public void getPassword() {
        assertEquals("pass", entry.getPassword());
    }

    @Test
    public void setDomain() {
        entry.setDomain("wfwf");
        assertEquals("wfwf", entry.getDomain());
    }

    @Test
    public void getDomain() {
        assertEquals("wfwf", entry.getDomain());

    }

    @Test
    public void setDescription() {
        entry.setDescription("wfwf");
        assertEquals("wfwf", entry.getDescription());
    }

    @Test
    public void getDescription() {
        assertEquals("wfwf", entry.getDescription());
    }

    @Test
    public void testCreate()
    {
        assertTrue( LoginEntry.createNewEntry("naam", "123", "bol.com", "Account voor bol.com") );
        assertTrue( LoginEntry.createNewEntry("e", "h", "gmail.com", "Account voor gmail.com") );
        assertFalse( LoginEntry.createNewEntry("hhh@h.com", "", "outlook", "") );
        assertFalse( LoginEntry.createNewEntry("", "123", "", "") );
        assertTrue( LoginEntry.createNewEntry("ejfsdjds", "jsdj", "", "") );
        assertFalse( LoginEntry.createNewEntry("", "", "", "") );
        assertTrue( LoginEntry.createNewEntry("111", "hhhhhhhh", "", "") );
    }
}