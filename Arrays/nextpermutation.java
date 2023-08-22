package Arrays;
import java.util.Scanner;
class nextpermutation {
    public static void nextPer(int[] arr) {
        //Time complexity - O(n)
        //Space complexity - O(1)
        int n = arr.length;
        int i,j;
        for(i=n-2;i>=0;i--) {
            if(arr[i]<arr[i+1])
                break;
        }
        if(i<0)
            reverse(arr,0,n-1);
        else {
            for(j=n-1;j>=0;j--) {
                if(arr[i]<arr[j])
                    break;
            }
            swap(arr,i,j);
            reverse(arr,i+1,n-1);
        }
    }
    public static void reverse(int[] arr, int start, int end) {
        //Time complexity - O(n)
        //Space complexity - O(1)
        while(start<end) {
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    public static void swap(int[] arr, int start, int end) {
        //Time and space complexity - O(1)
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter any permutation: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        nextPer(arr);
        System.out.print("Next permutation: ");
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}