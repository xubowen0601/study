package interfaces;

import java.util.Arrays;

/**
 * @author : [xubow]
 * @version : [v1.0]
 * @description : [给出了对一个 Employee 类实例数组进行排序的完整代码， 用于对一个员工数组排序]
 * This program demonstrates the use of the Comparable interface.
 * 本程序演示了可比接口的使用。
 * @createTime : [2021/1/11 16:06]
 */
public class EmployeeSortTest
{
    public static void main(String[] args)
    {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Harry Hacker", 35000);
        staff[1] = new Employee("Carl Cracker", 75000);
        staff[2] = new Employee("Tony Tester", 38000);

        Arrays.sort(staff);

//        print out information about all Employee objects
        for (Employee e : staff)
        {
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
        }
    }
}
