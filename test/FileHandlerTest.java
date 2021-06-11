import data.FileHandler;
import org.junit.Test;

import static org.junit.Assert.*;

public class FileHandlerTest {

    @Test
    public void createFile() {
        String filename = "testFile";

        FileHandler FH = new FileHandler(filename);

        FH.createFile(filename);

        assertTrue(FH.doesFileExist(filename));
    }

    @Test
    public void doesFileExist()
    {
        FileHandler FH = new FileHandler("data");

        assertTrue(FH.doesFileExist("data"));
    }
}