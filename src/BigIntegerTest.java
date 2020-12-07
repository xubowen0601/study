import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("你需要取多少个数字？");
        int k = in.nextInt();

        System.out.println("你能取的最高数字是多少？");
        int n = in.nextInt();

        /*
         *compute binomial coefficient n*(n-l)*(n-2)*...*(n-k+1)/(1*2*3...*k)
         */

        BigInteger lotteryOdds = BigInteger.valueOf(1);
        for (int i = 1; i <= k; i++) {
            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - 1 + i)).divide(BigInteger.valueOf(i));
        }
        System.out.println("你中将的几率为1/" + lotteryOdds + ".祝你好运！");
    }
}
