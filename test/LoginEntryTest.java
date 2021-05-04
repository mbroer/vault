import org.junit.Test;


import static org.junit.Assert.*;

public class LoginEntryTest
{

    private static LoginEntry entry = new LoginEntry("username", "pw", "domain", "desc");

    @Test
    public void setUsername() {
        entry.setUsername("name");
        assertEquals("", entry.getUsername());
    }

    @Test
    public void getUsername() {
        assertEquals("", entry.getUsername());
    }

    @Test
    public void setPassword() {
        entry.setPassword("pass");
        assertEquals("", entry.getPassword());
    }

    @Test
    public void getPassword() {
        assertEquals("", entry.getPassword());
    }

    @Test
    public void setDomain() {
        entry.setDomain("wfwf");
        assertEquals("", entry.getDomain());
    }

    @Test
    public void getDomain() {
        assertEquals("", entry.getDomain());

    }

    @Test
    public void setDescription() {
        entry.setDescription("wfwf");
        assertEquals("", entry.getDescription());
    }

    @Test
    public void getDescription() {
        assertEquals("", entry.getDescription());
    }
}