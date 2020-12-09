import java.time.LocalDate;

public class EmployeeTest
{
    public static void main(String[] args)
    {
//        fill the staff array with three Employee objects
//        用三个Employee对象填充staff数组
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

//        raise everyone's salary by 5%
//        给每个人加薪5%
        for (Employee e : staff)
        {
            e.raiseSalary(5);
        }

//        print out information about all Employee objects
//        打印出关于所有Employee对象的信息
        for (Employee e : staff)
        {
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hirDay=" + e.getHireDay());
        }

    }
}

class Employee
{
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String n, double s, int year, int month, int day)
    {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
//        System.out.println(hireDay);
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

    public static void main(String[] args)  //unit test
    {
        Employee e=new Employee("Romeo",50000,2003,3,31);
        e.raiseSalary(10);
        System.out.println(e.getName()+" "+e.getSalary());
    }

}
