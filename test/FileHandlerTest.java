import org.junit.Test;

import static org.junit.Assert.*;

public class FileHandlerTest {

    @Test
    public void createFile() {
        FileHandler FH = new FileHandler();

        String filename = "testFile";
        FH.createFile(filename);

        assertTrue(FH.doesFileExist(filename));
    }

    @Test
    public void doesFileExist()
    {
        FileHandler FH = new FileHandler();

        assertTrue(FH.doesFileExist("data"));
    }
}