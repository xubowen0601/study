import java.util.Scanner;

public class Retirement2 {
    public static void main(String[] args) {
        //        read inputs
        Scanner in = new Scanner(System.in);

        System.out.println("你每年会增加多少钱?");
        double payment = in.nextDouble();

        System.out.println("利率（%）：");
        double interestRate = in.nextDouble();

        double balance = 0;
        int year = 0;

        String input;

//        未达到目标时更新帐户余额
        do {
//            加上今年的付款和利息
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;

            year++;

//            输出当前余额
            System.out.printf("%d年以后,你的余额有 %,.2f%n", year, balance);

//            询问是否准备好退休并获得意见
            System.out.println("准备好退休了么?(Y/N)");
            input = in.next();
        } while (input.equals("N"));
    }
}
