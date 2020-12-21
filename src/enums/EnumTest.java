package enums;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.*;

/**
 * @author : [xubowen]
 * @version : [v1.0]
 * @description : [枚举类型工作方式]
 * @createTime : [2020/12/21 9:56]
 * @updateUser : [xubowen]
 */
public class EnumTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        out.println("输入大小:(SMALL，MEDIUM，LARGE，EXTRA_LARGE)");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        out.println("size=" + size);
        out.println("abbreviation=" + size.getAbbreviation());
        if (size == Size.EXTRA_LARGE)
        {
            out.println("干得好——你注意到了。");
        }
    }
}

enum Size
{
    /**
     * S
     */
    SMALL("S"),
    /**
     * M
     */
    MEDIUM("M"),
    /**
     * L
     */
    LARGE("L"),
    /**
     * XL
     */
    EXTRA_LARGE("XL");

    private String abbreviation;

    private Size(String abbreviation)
    {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation()
    {
        return this.abbreviation;
    }
}