import views.Welcome;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        Welcome w = new Welcome();
        do {
            w.welcomeSession();
        } while (true);
    }
}
