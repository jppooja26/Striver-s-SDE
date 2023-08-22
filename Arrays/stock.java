package Arrays;
import java.util.Scanner;
public class stock {
    public static int maximumProfit(int[] prices) {
        //Time complexity - O(n)
        //Space complexity - O(1)
        int maxProfit = Integer.MIN_VALUE;
        int minimum = prices[0];
        for(int i=0;i<prices.length;i++) {
            int cost = prices[i] - minimum;
            maxProfit = Math.max(maxProfit, cost);
            minimum = Math.min(minimum, prices[i]);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter stock prices: ");
        int[] prices = new int[n];
        for(int i=0;i<prices.length;i++) {
            prices[i] = sc.nextInt();
        }

        int profit = maximumProfit(prices);
        System.out.println("Maximum profit: "+profit);
        sc.close();
    }
}
