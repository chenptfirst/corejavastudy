package inheritance;

import java.util.ArrayList;

/**
 * @author gentleman
 * @version 0.1.0
 * @create 2021-04-20 22:02
 * @since 0.1.0
 **/
public class ManagerTest {
    public static void main(String[] args) {
        var boss=new Manager("boss",80000,1987,12,15);
        boss.setBonus(1000000);

        var staff=new ArrayList<Employee>(3);
        staff.add(boss);
        staff.add(new Employee("em1",60000,1990,1,14));
        staff.add(new Employee("em2",48000,1993,3,7));

        for (Employee employee:
             staff) {
            System.out.println("name:"+employee.getName()+",salary:"+employee.getSalary());
        }


    }
}
