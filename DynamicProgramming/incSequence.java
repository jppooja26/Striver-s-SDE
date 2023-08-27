package DynamicProgramming;
import java.util.Scanner;
import java.util.Arrays;
public class incSequence {
    public static int subsequence(int[] arr, int n) {
        int[] dp = new int[n];
        int len = 0;
        for(int i=0;i<n;i++) {
            int index = Arrays.binarySearch(dp,0,len,arr[i]);
            if(index<0)
                index = -(index+1);
            dp[index] = arr[i];
            if(index == len)
                len++;
        }
        return len;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter array elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int len =  subsequence(arr,n);
        System.out.println("Length of Longest increasing subsequence: "+len);
        sc.close();
    }
}
