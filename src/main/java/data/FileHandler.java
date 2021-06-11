package data;

import java.io.*;
import java.util.ArrayList;

import encryption.DecryptionHandler;
import encryption.EncryptionHandler;
import com.google.gson.*;

public class FileHandler
{
    //To easily be able to specify the file directory if needed
    private final String dataFolder = "data/";
    private final String fileExtension = ".json";
    private String currentFileName;
    private String fileFullPath;

    private FileWriter FW;

    private File file;

    public FileHandler(String filename)
    {
        currentFileName = filename+fileExtension;
        fileFullPath = dataFolder+currentFileName;

        if(!doesFileExist(currentFileName)){
            System.err.println("datafile"+ currentFileName +" is missing!");
            createFile(filename);
        }

        try{
            FW = new FileWriter(fileFullPath,true);
        }
        catch (IOException e){
            e.printStackTrace();
        }

        importFile(currentFileName);
    }


    //handles creating new files
    public void createFile(String filename)
    {
        System.out.println("Creating datafile: "+filename);

        try{
            new FileWriter(fileFullPath, true);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    //handles importing files
    public void importFile(String filename)
    {
        this.file = new File(dataFolder, filename);
    }

    //checks if file exists in dir
    public boolean doesFileExist(String filename)
    {
        return new File(dataFolder, addExtensionIfMissing(filename)).exists();
    }


    public String addExtensionIfMissing(String filename)
    {
        if(filename.contains(fileExtension))
            return filename;

        return filename+fileExtension;
    }

    public void saveLoginEntryToJson(LoginEntry entry)
    {
        entry.setPassword(EncryptionHandler.encrypt(entry.getPassword()));

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        JsonObject jsonObj = new JsonObject();
        JsonArray jsonArray = getEntriesFromJson();

        jsonArray.add(gson.toJsonTree(entry,LoginEntry.class));
        jsonObj.add("entries", jsonArray);

        try(FileWriter writer = new FileWriter(fileFullPath, false)){
            gson.toJson(jsonObj, writer);
        }
        catch (IOException e){
            e.printStackTrace();
        }

        entry.setPassword(DecryptionHandler.decrypt(entry.getPassword()));
    }

    public JsonArray getEntriesFromJson()
    {
        Gson gson = new Gson();
        JsonArray jsonArray = new JsonArray();

        try(FileReader reader = new FileReader(fileFullPath)){
            JsonParser parser = new JsonParser();
            JsonObject rootObj = parser.parse(reader).getAsJsonObject();
            jsonArray = rootObj.getAsJsonArray("entries");
        }
        catch (IOException e){
            e.printStackTrace();
        }

        return jsonArray;
    }

    //reads data from json file
    public ArrayList<LoginEntry> loadDataFromJson()
    {
        Gson gson = new Gson();

        ArrayList<LoginEntry> entries = new ArrayList<>();

        JsonArray jsonArray = getEntriesFromJson();

        //create Data.LoginEntry classes from json data
        if (jsonArray != null) {
            for (int i=0;i<jsonArray.size();i++) {
                LoginEntry entry = gson.fromJson(jsonArray.get(i), LoginEntry.class);
                entry.setPassword(DecryptionHandler.decrypt((entry.getPassword())));

                entries.add( entry );
            }
        }

        return entries;
    }
}


