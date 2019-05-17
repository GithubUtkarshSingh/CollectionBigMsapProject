package DataBase;

public class Weekly extends MainProgramme

{
    public static void printWeekly() 
    {
        for (int i = 0; i < list.size(); i++)
            if (types[i] == "Weekly") 
        {
        System.out.println(list.get(i));
        }
    }
}