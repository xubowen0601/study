import java.util.Arrays;
import java.util.Scanner;

public class LotteryDrawing
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("你需要取多少个数字？");
        int k = in.nextInt();

        System.out.println("你能取的最高数字是多少？");
        int n = in.nextInt();

        // fill an array with numbers 1 2 3 ... n
        // 用数字1、2、3...n填充数组
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = i + 1;
        }
        // draw k numbers and put them into a second array
        // 画出k个数字，并将它们放入第二个数组中
        int[] result = new int[k];
        for (int i = 0; i < result.length; i++)
        {
//            make a random index between 0 and n-1
//            在0到n-1之间建立一个随机索引
            int r = (int) (Math.random() * n);

//            pick the element at the random location
//            在随机位置选择元素
            result[i] = numbers[r];

//            move the last element into the random location
//            将最后一个元素移动到随机位置
            numbers[r] = numbers[n - 1];
            n--;
        }
//        print the sorted array
        Arrays.sort(result);
        System.out.println("Bet the following combination.It'll make you rich!");
        for (int r : result)
        {
            System.out.println(r);

        }
    }
}
