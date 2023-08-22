package Arrays;
import java.util.Scanner;
public class sort012 {
    public static void sort(int[] arr) {
        //Time complexity - O(n)
        //Space complexity - O(1)
        int c0=0,c1=0,c2=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==0)
                c0++;
            else if(arr[i]==1)
                c1++;
            else
                c2++;
        }
        int j = 0;
        while(c0>0) {
            arr[j] = 0;
            j++;
            c0--;
        }
        while(c1>0) {
            arr[j] = 1;
            j++;
            c1--;
        }
        while(c2>0) {
            arr[j] = 2;
            j++;
            c2--;
        }
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
        sort(arr);
        System.out.print("Sorted array: ");
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
