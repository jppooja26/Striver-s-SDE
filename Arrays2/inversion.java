//inversion using merge sort
import java.util.Scanner;

public class inversion {
    public static int merge(int[] arr, int begin, int mid, int end) {
        //Time complexity - O(nlogn)
        //Space complexity - O(n)
        int count=0, k=0;
        int[] temp = new int[(end-begin+1)];
        int i=begin,j=mid;
        while(i<mid && j<=end) {
            if(arr[i]<arr[j]) {
                temp[k] = arr[i];
                k++;
                i++;
            }
            else {
                temp[k] = arr[j];
                count += (mid-i);
                k++;
                j++;
            }
        }
        while(i<mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(j<=end) {
            temp[k] = arr[j];
            k++;
            j++;
        }
        return count;
    }
    public static int Count(int[] arr, int begin, int end) {
        int count = 0;
        if(begin<end) {
            int mid = (begin+end)/2;
            count += Count(arr,begin,mid);
            count += Count(arr,mid+1,end);
            count += merge(arr,begin,mid,end);
        }
        return count;
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

        int res = Count(arr,0,n-1);

        System.out.print("Number of inversions: "+res);

        sc.close();
    }
}
