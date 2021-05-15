import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class FileHandler
{
    //To easily be able to specify the file directory if needed
    private final String dataFolder = "data/";
    private final String fileExtension = ".json";

    private File file;

    //handles creating new files
    public void createFile(String filename)
    {
        try
        {
            new FileWriter(dataFolder+filename+fileExtension);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    //handles editing existing files
    public void editFile()
    {
    }

    //handles importing files
    public void importFile(String filename)
    {

    }

    //handles exporting files
    public void exportFile()
    {
    }

    //checks if file exists
    public boolean doesFileExist(String filename)
    {
        return new File(dataFolder,filename+fileExtension).exists();
    }
}
