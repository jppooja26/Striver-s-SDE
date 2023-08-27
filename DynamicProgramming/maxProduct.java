package DynamicProgramming;
import java.util.Scanner;
class maxProduct {
    public static int product(int[] arr, int n) {
        int maxPrf = Integer.MIN_VALUE;
        int maxSuf = Integer.MIN_VALUE;
        int prf = 1, suf = 1;
        for(int i=0;i<n;i++) {
            prf *= arr[i];
            suf *= arr[n-i-1];
            maxPrf = Math.max(maxPrf, prf);
            maxSuf = Math.max(maxSuf, suf);
        }
        return Math.max(maxSuf, maxPrf);
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
        int maxi = product(arr,n);
        System.out.println("Maximum Product: "+maxi);
        sc.close();
    }
}