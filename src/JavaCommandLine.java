
import java.io.Console;

/**
 * Created by IntelliJ IDEA.
 * User: mpmenne
 * Date: 3/17/14
 * Time: 6:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class JavaCommandLine {

    public static void main(String[] varArgs) {
        System.out.println("Hello, I am a computer");
        
        Console c = System.console();
        String name = c.readLine("What is your name? ");
        System.out.println("Hello " + name);
    }
}