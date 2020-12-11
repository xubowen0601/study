import java.util.Random;

/**
 * @author xubow
 */
public class ConstructorTest
{
    public static void main(String[] args)
    {
//        fill the staff array with three Employee objects
//        用三个Employee对象填充staff数组
        Employee4[] staff = new Employee4[3];
        staff[0] = new Employee4("Harry", 40000);
        staff[1] = new Employee4(60000);
        staff[2] = new Employee4();
//        print out information about all Employee objects
//        打印有关所有Employee对象的信息
        for (Employee4 employee : staff)
        {
            System.out.println("name=" + employee.getName()
                    + ",id=" + employee.getId()
                    + ",salary=" + employee.getSalary());
        }

    }
}

class Employee4
{
    private static int nextId;

    private int id;
    /**
     * name
     * instance field initialization
     * 实例字段初始化
     */
    private String name = "";
    private double salary;

    //    static initialization block
//    静态初始化块
    static
    {
        Random generator = new Random();
//        set nextId to a random number between 0 and 9999
//        将nextId设置为0到9999之间的随机数
        nextId = generator.nextInt(10000);
    }

    //    object initialization block
//    对象初始化块
    {
        id = nextId;
        nextId++;
    }

    /**
     * @author three overloaded constructors
     * 三个重载的构造函数
     */

    public Employee4(String aname, double asalary)
    {
        name = aname;
        salary = asalary;
    }

    public Employee4(double asalary)
    {
//        calls the Employee(String,double) constructor
//        调用Employee（String，double）构造函数
        this("Employee #" + nextId, asalary);
    }

    /**
     * @author xubowen
     * the default constructor
     * 默认构造函数
     */
    public Employee4()
    {
//        name initialized to "" --see above
//        名称初始化为“”-参见上文
//        salary not explicitly set --initialized to 0
//        工资未明确设置-初始化为0
//        id initialized in initialization block
//        在初始化块中初始化的id
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }
}
