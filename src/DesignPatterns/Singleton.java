package src.DesignPatterns;

public class Singleton
{
    private static volatile Singleton instance;

    private Singleton()
    {
        System.out.println("Constructor");
    }

    public static Singleton getInstance()
    {
        if(instance==null)
        {
            synchronized (Singleton.class)
            {
                if(instance==null)
                {
                    instance= new Singleton();
                }
            }
        }
        return instance;
    }
    public void executeQuery(String query)
    {
        System.out.println("Executing query.."+query);
    }

    public static void main(String[] args) {

    }
}
