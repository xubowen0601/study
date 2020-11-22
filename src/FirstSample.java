import static java.lang.Math.*;

public class FirstSample {
    public static void main(String[] args) {
        System.out.println("We will not use 'Hello World!'");
        System.out.println(2.0 - 1.1);
        int vacation = 12;
        System.out.println(vacation);
        double salary = 65000.0;
        System.out.println(salary);
        final double CM_PER_INCH = 2.54;
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters:"
                + paperWidth * CM_PER_INCH + "by" + paperHeight * CM_PER_INCH);
        double x = 4;
        double y = Math.sqrt(x);
        System.out.println(y);
        double a = 10;
        double y1 = pow(x, a);
        System.out.println(y1);
        double d = 9.997;
        int nd = (int) Math.round(d);
        System.out.println(nd);
        int m = 7;
        int n = 7;
        int e = 2 * ++m;
        int f = 2 * n++;
        System.out.println(e + "            " + f);
        String greeting = "hello";
        System.out.println("Hello".equals(greeting));
        System.out.println("Hello".equalsIgnoreCase(greeting));
    }
}
/**
 *
 */
