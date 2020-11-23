import java.util.Scanner;

public class LoteryOdds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("你需要取多少个数字？");
        int k = in.nextInt();

        System.out.println("你能取的最高数字是多少？");
        int n = in.nextByte();

        /**
         * 计算二项式系数 n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
         */

        int lotteryOdds = 1;
        for (int i = 1; i <= k; i++) {
            lotteryOdds = lotteryOdds * (n - i + 1) / i;
        }
        System.out.println("你中将的几率为1/" + lotteryOdds + ".祝你好运！");
    }
}
