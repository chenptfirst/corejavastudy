package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;
import java.util.StringJoiner;

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
//        String name = in.next();
        String name="java.lang.Double";
        Class cl=Class.forName(name);

        String modifiers= Modifier.toString(cl.getModifiers());

        String  superClass=cl.getSuperclass().getName();

        System.out.println(modifiers+" "+cl.getName()+" extends "+superClass);
        //输出构造函数
        printConstructor(cl);
        System.out.println("");
        //输出成员变量
        printFields(cl);
        System.out.println("");
        //输出方法
        printMtehods(cl);
    }
    /**
     * 输出成员变量
     * @param cl
     */
    private static void printFields(Class cl) {
        Field[] fields=cl.getDeclaredFields();
        for (Field  field:fields) {
            StringBuilder stb=new StringBuilder("");
            stb.append(Modifier.toString(field.getModifiers()));
            stb.append(" ");
            stb.append(field.getType().getName());
            stb.append(" ");
            stb.append(field.getName());
            stb.append(";");
            System.out.println(stb.toString());
        }
    }

    /**
     * 输出方法
     * @param cl
     */
    private static void printMtehods(Class cl) {
        Method[] methods=cl.getMethods();
        for (Method method: methods) {
            StringBuilder stb=new StringBuilder("");
            stb.append(Modifier.toString(method.getModifiers()));
            stb.append(" ");
            stb.append(method.getReturnType().getName());
            stb.append(" ");
            stb.append(method.getName());
            StringJoiner stringJoiner=new StringJoiner(",","(",");");
            for (Class  parameterType:
                    method.getParameterTypes()) {
                stringJoiner.add(parameterType.getName());
            }
            stb.append(stringJoiner.toString());
            System.out.println(stb.toString());

        }
    }

    /**
     * 输出构造函数
     * @param cl
     */
    private static void printConstructor(Class cl) {
        Constructor[] constructors=cl.getConstructors();
        for (Constructor constructor :
                constructors) {
            StringBuilder stb=new StringBuilder();
            int modifier=constructor.getModifiers();
            stb.append(Modifier.toString(modifier));
            stb.append(" ");
            stb.append(cl.getName());
            StringJoiner stringJoiner=new StringJoiner(",","(",");");
            for (Class  parameterType:
                    constructor.getParameterTypes()) {
                stringJoiner.add(parameterType.getName());
            }
            stb.append(stringJoiner.toString());
            System.out.println(stb.toString());

        }

    }

}
