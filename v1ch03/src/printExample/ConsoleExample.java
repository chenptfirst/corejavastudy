package printExample;

import java.io.Console;

public class ConsoleExample {
    public static void main(String[] args) {
        Console console=System.console();
        String userName=console.readLine("Username:");
        char[] password=console.readPassword("password");
        System.out.println(userName+":"+new String(password));
    }

}
