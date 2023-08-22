package Arrays;
import java.util.Scanner;
public class kadane {
    public static int maxSum(int[] arr) {
        //Time complexity - O(n)
        //Space complexity - O(1)
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            sum += arr[i];
            maxi = Math.max(maxi, sum);
            if(sum<0)
                sum=0;
        }
        return maxi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter array: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int res = maxSum(arr);
        System.out.println("Maximum sum subarray: "+res);
        sc.close();
    }
}
