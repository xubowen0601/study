package interfaces;

/**
 * @author : [xubow]
 * @version : [v1.0]
 * @description : [给出了对一个 Employee 类实例数组进行排序的完整代码， 用于对一个员工数组排序]
 * @createTime : [2021/1/11 16:07]
 */
public class Employee implements Comparable<Employee>
{
    private String name;
    private double salary;

    public Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    /**
     * @param other another Employee object
     *              其他另一个Employee对象
     * @return a negative if this employee has a lower salary
     * than otherObject,0 if the salaries are the same,
     * a positive value otherwise.
     * 如果此员工的薪水低于otherObject，则为负；如果薪水相同，则为0；否则为正值。
     * @description: Compares employees by salary
     *               按工资比较员工
     * @author xubowen
     * @date 2021/01/11 16:22
     */

    @Override
    public int compareTo(Employee other)
    {
        return Double.compare(salary, other.salary);
    }
}
