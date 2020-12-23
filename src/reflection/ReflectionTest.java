package reflection;

import static java.lang.System.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

/**
 * @author : [xubowen]
 * @version : [v1.0]
 * @description : [分析Java解释器能够加载的任何类]
 * @createTime : [2020/12/22 10:33]
 */
public class ReflectionTest
{
    public static void main(String[] args)
    {
//        read class name from command line args or user input
//        从命令行参数或用户输入中读取类名
        String name;
        if (args.length > 0)
        {
            name = args[0];
        } else
        {
            Scanner in = new Scanner(System.in);
            out.println("Enter class name (e.g. java.util.Date):");
            name = in.next();
        }

        try
        {
//            print class name and superclass name (if !=Object)
//            打印类名和超类名（如果！= Object）
            Class cl = Class.forName(name);
            Class supercl = cl.getSuperclass();

//            获取cl的访问权限修饰符（public，private等）
            String modifiers = Modifier.toString(cl.getModifiers());
            if (modifiers.length() > 0)
            {
                out.print(modifiers + " ");
            }
            out.print("class " + name);
            if (supercl != null && supercl != Object.class)
            {
                out.print(" extends " + supercl.getName());
            }
            out.print("\n{\n");

//            打印构造方法
            printConstructors(cl);
            out.println();

//            打印成员方法
            printMethods(cl);
            out.println();

//            打印域（成员变量）
            printFields(cl);
            out.println("}");
        } catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        System.exit(0);
    }

    /**
     * Prints all constructors of a class
     * 打印类的所有构造函数
     *
     * @param cl a class
     */
    public static void printConstructors(Class cl)
    {
        Constructor[] constructor = cl.getDeclaredConstructors();

        for (Constructor c : constructor)
        {
            String name = c.getName();
            out.print("     ");

            String modifiers = Modifier.toString(c.getModifiers());
            if (modifiers.length() > 0)
            {
                out.print(modifiers + " ");
            }
            out.print(name + "(");

//            print parameter types
//            打印参数类型
            Class[] paramTypes = c.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++)
            {
                if (j > 0)
                {
                    out.print(",");
                }
                out.print(paramTypes[j].getName());
            }
            out.println(");");
        }
    }

    /**
     * Prints all methods of a class
     *
     * @param cl a class
     */
    public static void printMethods(Class cl)
    {
        Method[] methods = cl.getDeclaredMethods();

        for (Method m : methods)
        {
            Class reType = m.getReturnType();
            String name = m.getName();

            out.print("     ");

//                print modifiers,return type and method name
//                打印修饰符，返回类型和方法名称
            String modifiers = Modifier.toString(m.getModifiers());
            if (modifiers.length() > 0)
            {
                out.print(modifiers + " ");
            }
            out.print(reType.getName() + " " + name + "(");

//                print parameter types
//                打印参数类型
            Class[] paramTypes = m.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++)
            {
                if (j > 0)
                {
                    out.print(",");

                }
                out.print(paramTypes[j].getName());
            }
            out.println(");");
        }
    }

    /**
     * Prints all fields pf a class
     *
     * @param cl a class
     */
    public static void printFields(Class cl)
    {
        Field[] fields = cl.getDeclaredFields();

        for (Field f : fields)
        {
            Class type = f.getType();
            String name = f.getName();
            out.print("     ");
            String modifiers = Modifier.toString(f.getModifiers());
            if (modifiers.length() > 0)
            {
                out.print(modifiers + " ");
            }
            out.println(type.getName() + " " + name + ";");
        }
    }
}