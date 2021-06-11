package ui;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class UserInterface
{
    //linked hashmap has predictable iteration order
    private static LinkedHashMap<String, Runnable> menu = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void start()
    {
        showMainMenu();
        controls();
    }

    //add entry to menu
    public static void addMenuOpt(String text, Runnable function)
    {
        menu.put(menu.size()+1 + ") " + text, function);
    }

    //shows all entries in menu
    public static void showMainMenu()
    {
        if(menu.size() <= 0)
            return;

        for(int i=0;i<menu.size(); i++)
            System.out.println(menu.keySet().toArray()[i]);
    }

    public static void controls()
    {
        while(scanner.hasNextLine())
        {
            String str = getScannerResult(true);

            if(!isValidInput(str))
                continue;

            System.out.println("\n" + "=".repeat(120));

            //call stored function
            menu.get(menu.keySet().toArray()[Integer.parseInt(str)-1]).run();

            System.out.println("=".repeat(120));

            getScannerResult("\nDruk op enter om terug te gaan naar menu", false);
            showMainMenu();
        }
    }

    public static boolean isValidInput(String strInput)
    {
        if(strInput.matches("[-+]?\\d*\\.?\\d+")) //check if string can be parsed to int
        {
            int intInput = Integer.parseInt(strInput)-1;
            if(intInput >= 0 && intInput < menu.size())
                return true;
        }

        System.out.println("Verkeerde input");
        return false;
    }

    public static String getScannerResult(boolean notNull)
    {
        return getScannerResult("", notNull);
    }

    public static String getScannerResult(String msg, boolean notNull)
    {
        if(!msg.isEmpty())
            System.out.println(msg);

        String str = scanner.nextLine();

        if(notNull && str.isEmpty())
            getScannerResult("Verkeerde input", true);

        return str;
    }
}