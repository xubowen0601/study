package inheritance;

import java.time.LocalDate;

/**
 * @author xubowen
 */
public class Employee
{

    private String name;
    private double salary;
    private LocalDate hireDay;

    /**
     * @param name   the employee's name    员工姓名
     * @param salary the salary             工资
     * @param year   the hire year          雇用年
     * @param month  the hire month         雇用月
     * @param day    the hire day           雇用日
     */

    public Employee(String name, double salary, int year, int month, int day)
    {
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public LocalDate getHireDay()
    {
        return hireDay;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary + byPercent / 100;
        salary += raise;
    }
}
