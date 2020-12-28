package methods;

import static java.lang.System.*;

import java.lang.reflect.Method;

/**
 * @author : [xubowen]
 * @version : [v1.0]
 * @description : [打印诸如 Math.sqrt、Math.sin 这样的数学函数值表的程序。]
 * This program shows how to invoke methods through reflection.
 * 该程序显示了如何通过反射调用方法。
 * @createTime : [2020/12/25 16:53]
 */
public class MethodTableTest
{
    public static void main(String[] args) throws Exception
    {
//        get method pointers to the square and sqrt methods
//        获取指向square和sqrt方法的方法指针
        Method square = MethodTableTest.class.getMethod("square", double.class);
        Method sqrt = Math.class.getMethod("sqrt", double.class);

//        print tables of x- and y-values
//        打印x和y值表

        printTable(1, 10, 10, square);
        printTable(1, 10, 10, sqrt);
    }

    /**
     * @param x a number
     * @return x squared
     * @description: Returns the square of a number.
     * 返回数字的平方。
     * @author xubowen
     * @date 2020/12/25 16:59
     */
    public static double square(double x)
    {
        return x * x;
    }

    /**
     * @param from the lower bound for the x-values     x值的下限
     * @param to   the upper bound for the x-values     x值的上限
     * @param n    the number do rows in the table      表中行数
     * @param f    a method with a double parameter and double return value
     *             具有双参数和双返回值的方法
     * @description: Prints a table with x- and y-values for a method
     * 打印方法的具有x和y值的表
     * @author xubowen
     * @date 2020/12/25 17:00
     */
    public static void printTable(double from, double to, int n, Method f)
    {
//        print out the method as table header
//        打印该方法作为表头
        out.println(f);
        double dx = (to - from) / (n - 1);

        for (double x = from; x <= to; x += dx)
        {
            try
            {
                double y = (Double) f.invoke(null, x);
                out.printf("%10.4f|%10.4f%n", x, y);
            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
