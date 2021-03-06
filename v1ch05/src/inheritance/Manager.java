package inheritance;

import java.time.LocalDate;

/**
 * @author gentleman
 * @version 0.1.0
 * @create 2021-04-20 21:55
 * @since 0.1.0
 **/

public class Manager extends Employee{

    private double bonus;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus=0;
    }


    @Override
    public double getSalary() {
        double baseSalary=super.getSalary();
        return baseSalary+=bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
