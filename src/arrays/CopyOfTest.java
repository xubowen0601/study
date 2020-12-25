package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

import static java.lang.System.*;

/**
 * @author : [xubowen]
 * @version : [v1.0]
 * @description : [扩展数组]
 * This program demonstrates the use of reflection for
 * manipulating arrays.
 * 该程序演示了如何使用反射来处理数组。
 * @createTime : [2020/12/25 11:02]
 */
public class CopyOfTest
{
    public static void main(String[] args)
    {
        int[] a = {1, 2, 3};
        a = (int[]) goodCopyOf(a, 10);
        out.println(Arrays.toString(a));

        String[] b = {"Tom", "Dick", "Harry"};
        b = (String[]) goodCopyOf(b, 10);
        out.println(Arrays.toString(b));

        out.println("The following call will generate an exception." +
                "\n以下调用将生成异常。");
//        b = (String[]) badCopyOf(b, 10);
    }

    /**
     * @param a         the array to grow   要增长的阵列
     * @param newLength the new length      新长度
     * @return a larger array that contains all elements of a.However
     * ,the returned array has type Object[],not the same type as a.
     * 包含a的所有元素的较大数组。但是，返回的数组的类型为object[]，与a的类型不同。
     * @description: This method attempts to grow an array
     * by allocating a new array and copying all elements.
     * 此方法尝试通过分配新数组并复制所有元素来扩展数组。
     * @author xubowen
     * @date 2020/12/25 11:08
     */

    public static Object[] badCopyOf(Object[] a, int newLength)
    {
        Object[] newArray = new Object[newLength];
        /*
         *public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
         *代码解释:
         *Object src : 原数组
         *int srcPos : 从元数据的起始位置开始
         *Object dest : 目标数组
         *int destPos : 目标数组的开始起始位置
         *int length  : 要copy的数组的长度
         *比如 ：我们有一个数组数据 byte[]  srcBytes = new byte[]{2,4,0,0,0,0,0,10,15,50};  // 源数组
         *byte[] destBytes = new byte[5]; // 目标数组
         *我们使用System.arraycopy进行转换(copy)
         *System.arrayCopy(srcBytes,0,destBytes ,0,5)
         *上面这段代码就是 : 创建一个一维空数组,数组的总长度为 12位,然后将srcBytes源数组中 从0位 到 第5位之间的数值 copy 到 destBytes目标数组中,在目标数组的第0位开始放置.
         *那么这行代码的运行效果应该是 2,4,0,0,0,
         */
        arraycopy(a, 0, newArray, 0, Math.min(a.length, newLength));
        return newArray;
    }
    //    not useful


    /**
     * @param a the array to grow.This can be an object array or a primitive type array
     * @return a larger array that contains all elements of a.
     * @description: This method grows an array by allocating a new array of the same type and copying all elements.
     * @author xubowen
     * @date 2020/12/25 11:13
     */
    public static Object goodCopyOf(Object a, int newLength)
    {
        Class cl = a.getClass();
        if (!cl.isArray())
        {
            return null;
        }
        Class componentType = cl.getComponentType();
//        out.println(componentType);
        int length = Array.getLength(a);
        Object newArray = Array.newInstance(componentType, newLength);
        arraycopy(a, 0, newArray, 0, Math.min(length, newLength));
        return newArray;
    }

}
