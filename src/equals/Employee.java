package equals;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author : [xubowen]
 * @version : [v1.0]
 * @description : [toString,hashCode,equals方法]
 * @createTime : [2020/12/16 17:12]
 * @updateUser : [xubowen]
 * @updateTime : [2020/12/16 17:12]
 * @updateRemark : [首次]
 */
public class Employee
{
    private String name;
    private double salary;
    private LocalDate hireDay;

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
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public boolean equals(Object otherObject)
    {
//        a quick test to see if the objects are identical
//        快速测试以查看对象是否相同
        if (this == otherObject)
        {
            return true;
        }

//        must return false if the explicit parameter is null
//        如果显式参数为null，则必须返回false
        if (otherObject == null)
        {
            return false;
        }

//        if the classes don't match,they can't be equal
//        如果类不匹配，就不能相等
        Employee other = (Employee) otherObject;

//        test whether the fields have identical values
//        测试字段是否具有相同的值
        return Objects.equals(name, other.name) && salary == other.salary
                && Objects.equals(hireDay, other.hireDay);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, salary, hireDay);
    }

    @Override
    public String toString()
    {
        return getClass().getName() +
                "[name='" + name +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                ']';
    }
}
