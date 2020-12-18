package arraylist;

import equals.Employee;

import java.util.ArrayList;

import static java.lang.System.*;

/**
 * @author : [xubowen]
 * @version : [v1.0]
 * @description : [ 不必指出数组的大小 。
 * 使用 add 将任意多的元素添加到数组中 。
 * 使用 sizeO 替代 length 计算元素的数目 。
 * 使用 a.get(i）替代 a[i］访问元素 。]
 * @createTime : [2020/12/18 14:34]
 * @updateUser : [xubowen]
 * @updateTime : [2020/12/18 14:34]
 * @updateRemark : [说明本次修改内容]
 */
public class ArrayListTest
{
    public static void main(String[] args)
    {
//        fill the staff array list three Employee objects
//        填充人员数组列表中的三个Employee对象
        ArrayList<Employee> staff = new ArrayList<>();

        staff.add(new Employee("Carl Cracker",
                75000, 1987, 12, 15));
        staff.add(new Employee("Harry Hacker",
                50000, 1989, 10, 1));
        staff.add(new Employee("Tony Tester",
                40000, 1990, 3, 15));

//        raise everyone's salary by 5%
//        将每个人的工资提高5％
        for (Employee e : staff)
        {
            e.raiseSalary(5);
        }

//        print out information about all Employee objects
//        打印有关所有Employee对象的信息
        for (Employee e : staff)
        {
            out.println("name=" + e.getName() +
                    ",salary=" + e.getSalary() +
                    ",hireDay=" + e.getHireDay());
        }

    }
}
