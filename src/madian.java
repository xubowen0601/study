import java.util.Scanner;

public class madian {
    public static void main(String[] args) {
        String greeting = "Hello";
        int n = greeting.length();
        System.out.println(n);
        int cpCount = greeting.codePointCount(0, greeting.length());
        System.out.println(cpCount);
        char first = greeting.charAt(0);
        System.out.println(first);
        char last = greeting.charAt(4);
        System.out.println(last);
        int index = greeting.offsetByCodePoints(0, 2);
        System.out.println(index);
        int cp = greeting.codePointAt(index);
        System.out.println(cp);

        StringBuilder builder = new StringBuilder();

        Scanner in = new Scanner(System.in);
        System.out.println("你的名字？");
        String name=in.nextLine();
        String firstName=in.next();
        System.out.println("你的年龄？");
        int age=in.nextInt();
    }
}
