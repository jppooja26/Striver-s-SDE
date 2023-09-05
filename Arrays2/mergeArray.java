import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class mergeArray {
    public static void merge(int[] arr1, int n, int[] arr2, int m) {
        //Time complexity - O((n+m)log(n+m))
        //Space complexity - O(n+m)
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++) {
            arr.add(arr1[i]);
        }
        for(int i=0;i<m;i++) {
            arr.add(arr2[i]);
        }
        Collections.sort(arr);
        int j = 0;
        for(int i=0;i<n;i++) {
            arr1[i] = arr.get(j);
            j++;
        }
        for(int i=0;i<m;i++) {
            arr2[i] = arr.get(j);
            j++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter sorted array1 elements: ");
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter m: ");
        int m = sc.nextInt();
        System.out.print("Enter sorted array2 elements: ");
        int[] arr2 = new int[m];
        for(int i=0;i<m;i++) {
            arr2[i] = sc.nextInt();
        }

        merge(arr1,n,arr2,m);

        System.out.print("After merging: ");
        for(int i=0;i<n;i++) {
            System.out.print(arr1[i]+" ");
        }
        for(int i=0;i<m;i++) {
            System.out.print(arr2[i]+" ");
        }
        sc.close();
    }
}
