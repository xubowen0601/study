package abstractclasses;

import java.time.LocalDate;

/**
 * @description  : [抽象类查看]
 * @author       : [xubowen]
 * @version      : [v1.0]
 * @createTime   : [2020/12/15 10:34]   
 * @updateUser   : [xubowen]
 * @updateTime   : [2020/12/15 10:34]   
 * @updateRemark : [首次修改]
 */
public class Employee extends Person
{
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day)
    {
        super(name);
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public double getSalary()
    {
        return salary;
    }

    public LocalDate getHireDay()
    {
        return hireDay;
    }

    @Override
    public String getDescription()
    {
        return String.format("这个雇员的工资为$%.2f",salary);
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary*byPercent / 100;
        salary += raise;
    }
}
