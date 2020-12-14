import com.horstmann.corejava.Employee;

import static java.lang.System.*;
//the Employee class is defined in that package
//该包中定义了Employee类

/**
 * @author xubow
 */
public class PackageTest
{
    public static void main(String[] args)
    {
//        because of the import statement,we don't have to use
//        由于导入语句，我们不必使用
//        com.horstmann.corejava.Employee here
//        com.horstmann.corejava.Employee在这里
        Employee harry = new Employee("Harry Hacker",
                50000, 1989, 10, 1);

        harry.raiseSalary(5);

//        because of the static import statement,we don't have to use System.out here
//        由于静态导入语句，我们不必在这里使用System.out
        out.println("name=" + harry.getName()
                + ",salary=" + harry.getSalary());
    }
}
