public class ParamTest
{
    public static void main(String[] args)
    {
        /*
        Test 1:Methods can't modify numeric parameters
        测试1：方法无法修改数值参数
         */
        System.out.println("测试三重值");
        double percent = 10;
        System.out.println("Before:percent=" + percent);
        tripleValue(percent);
        System.out.println("After:percent=" + percent);

        /*
        Test 2:Methods can change the state of object parameters
        测试2：方法可以更改对象参数的状态
         */
        System.out.println("\n测试三倍工资:");
        Employee3 harry = new Employee3("Harry", 50000);
        System.out.println("Before:salary=" + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After:salary=" + harry.getSalary());

        /*
        Test 3:Methods can't attach new objects to object parameters
        测试3：方法不能将新对象附加到对象参数
         */
        System.out.println("\n测试交换:");
        Employee3 a = new Employee3("Alice", 70000);
        Employee3 b = new Employee3("Bob", 60000);
        System.out.println("Before:a=" + a.getName());
        System.out.println("Before:b=" + b.getName());
        swap(a, b);
        System.out.println("Before:a=" + a.getName());
        System.out.println("Before:b=" + b.getName());

    }

    public static void tripleValue(double x) //doesn't work     不起作用
    {
        x = 3 * x;
        System.out.println("End of method:x=" + x);
    }

    public static void tripleSalary(Employee3 x)
    {
        x.raiseSalary(200);
        System.out.println("End of method:salary=" + x.getSalary());
    }

    public static void swap(Employee3 x, Employee3 y)
    {
        Employee3 temp = x;
        x = y;
        y = temp;
        System.out.println("End of method:x=" + x.getName());
        System.out.println("End of method:y=" + y.getName());
    }
}

class Employee3     //simplified Employee class     简化员工类
{
    private String name;
    private double salary;

    public Employee3(String n, double s)
    {
        name = n;
        salary = s;
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
}