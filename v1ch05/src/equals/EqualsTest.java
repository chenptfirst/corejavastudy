package equals;

/**
 * @author gentleman
 * @version 0.1.0
 * @create 2021-04-20 22:41
 * @since 0.1.0
 **/
public class EqualsTest {
    public static void main(String[] args) {
        var alice1=new Employee("em1",6000,1987,10,4);
        var alice2=alice1;
        var alice3=new Employee("em1",6000,1987,10,4);
        var bob=new Employee("embob",6000,1987,5,3);
        System.out.println("alice1==alice2:"+(alice1==alice2));

        System.out.println("alice1==alice3:"+(alice1==alice3));

        System.out.println("alice1.equals(alice3):"+(alice1.equals(alice3)));

        System.out.println("alice1.equals(bob):"+(alice1.equals(bob)));

        System.out.println("bob.toString():"+(bob.toString()));

        System.out.println("bob.hashCode():"+bob.hashCode());

    }

}
