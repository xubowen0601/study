import java.util.Scanner;

public class Retirement {
    public static void main(String[] args) {
//        read inputs
        Scanner in = new Scanner(System.in);

        System.out.println("你退休需要多少钱？?");
        double goal = in.nextDouble();

        System.out.println("你每年会增加多少钱?");
        double payment = in.nextDouble();

        System.out.println("利率（%）：");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;

//        未达到目标时更新帐户余额
        while (balance < goal) {
//            加上今年的付款和利息
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
        }
        System.out.println("你可以退休 " + years + " 年。");

    }
}
