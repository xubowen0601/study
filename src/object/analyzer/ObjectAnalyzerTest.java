package object.analyzer;

import static java.lang.System.*;

import java.util.ArrayList;

/**
 * @author : [xubowen]
 * @version : [v1.0]
 * @description : [通用的 to String 方法测试]
 * This program uses reflection to spy on objects.
 * 这个程序使用反射来监视对象。
 * @createTime : [2020/12/23 15:34]
 */
public class ObjectAnalyzerTest
{
    public static void main(String[] args)
    {
        ArrayList<Integer> squares = new ArrayList<>();
        for (int i = 1; i <= 5; i++)
        {
            squares.add(i * i);
        }
        out.println(new ObjectAnalyzer().toString(squares));
    }
}
