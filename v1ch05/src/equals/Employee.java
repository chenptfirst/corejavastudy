package equals;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author gentleman
 * @version 0.1.0
 * @create 2021-04-20 21:40
 * @since 0.1.0
 **/
public class Employee {

    private String name;

    private double salary;

    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year,month,day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    /**
     * 按百分比加工资
     * @param byPercent
     */
    public void raiseSalary(double byPercent){
        double raise=salary*byPercent/100;
        salary+=raise;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)  return true;

        if (o == null) return false;
        if ( getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(hireDay, employee.hireDay);
    }



    @Override
    public int hashCode() {
        return Objects.hash(name, salary, hireDay);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }
}
