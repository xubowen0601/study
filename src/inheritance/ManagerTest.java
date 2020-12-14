package inheritance;

import static java.lang.System.*;

/**
 * @author xubowen
 */
public class ManagerTest
{
    public static void main(String[] args)
    {
//        construct a Manager object
//        构造一个Manager对象
        Manager boos = new Manager("Carl Cracker",
                80000, 1987, 12, 15);
        boos.setBonus(5000);

        Employee[] staff = new Employee[3];
        staff[0] = boos;
        staff[1] = new Employee("Harry Hacker",
                50000, 1989, 10, 1);
        staff[2] = new Employee("Tommy Tester",
                40000, 1990, 3, 15);

//        print out information about all Employee objects
//        打印有关所有Employee对象的信息
        for (Employee e : staff)
        {
            out.println("name=" + e.getName() +
                    ",salary=" + e.getSalary());
        }
    }
}
