import org.junit.Test;


import static org.junit.Assert.*;

public class LoginEntryTest
{

    private static LoginEntry entry = new LoginEntry("username", "pw", "domain", "desc");

    @Test
    public void testCreate()
    {
        String emptyUsername = "", emptyPW = "", emptyDomain = "", emptyDESC = "";

        String username = "username";
        Integer usernameINT = 123;

        String password = "password";
        String domain = "domain";
        String desc = "description";
        /*
        assertTrue( LoginEntry.createNewEntry( username, password, domain, desc, false ) );
        assertTrue( LoginEntry.createNewEntry( username, emptyPW, emptyDomain, emptyDESC, false ) );

        assertTrue( LoginEntry.createNewEntry( usernameINT, password, emptyDomain, desc, false ) );
        assertTrue( LoginEntry.createNewEntry( usernameINT, emptyPW, domain, emptyDESC, false ) );

        assertTrue( LoginEntry.createNewEntry( emptyUsername, emptyPW, domain, emptyDESC, false ) );
        assertTrue( LoginEntry.createNewEntry( emptyUsername, emptyPW, domain, emptyDESC, false ) );
        */
    }
}