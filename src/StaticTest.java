public class StaticTest
{
    public static void main(String[] args)
    {
//        fill the staff array with three Employee objects
//        用三个employee对象填充staff数组
        Employee2[] staff = new Employee2[3];

        staff[0] = new Employee2("Tom", 40000);
        staff[1] = new Employee2("Dick", 60000);
        staff[2] = new Employee2("Harry", 65000);

//        print out information about all Employee objects
//        打印所有员工对象的信息
        for (Employee2 e : staff)
        {
            e.setId();
            System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary=" + e.getSalary());
        }
    }
}

class Employee2
{
    private static int nextId = 1;

    private String name;
    private double salary;
    private int id;

    public Employee2(String n, double s)
    {
        name = n;
        salary = s;
        id = 0;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public int getId()
    {
        return id;
    }

    public void setId()
    {
        id = nextId;  //      set id to next available id
        //      将id设置为下一个可用id
        nextId++;
    }

    public static int getNextId()
    {
        return nextId;  //      return static field
        //      返回静态场
    }

    public static void main(String[] args)  //  unit test
    {
        Employee2 e = new Employee2("Harry", 50000);
        System.out.println(e.getName() + "    " + e.getSalary());
    }

}
