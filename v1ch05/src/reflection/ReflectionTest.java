package reflection;

import java.lang.reflect.Modifier;
import java.util.Scanner;

/**
 * @author gentleman
 * @version 0.1.0
 * @create 2021-04-21 00:12
 * @since 0.1.0
 **/
public class ReflectionTest {
    public static void main(String[] args) throws ClassNotFoundException {
        var in = new Scanner(System.in);
        System.out.println("Enter class name (e.g. java.util.Date): ");
        String name = in.next();
        Class cl=Class.forName(name);

        String modifiers= Modifier.toString(cl.getModifiers());

        String  superClass=cl.getSuperclass().getName();

        System.out.println(modifiers+" "+cl.getName()+" extends "+superClass);


    }

}
