import java.util.Scanner;

public class RepeatMissing {
    public static int[] findElement(int[] arr, int n) {
        //Time complexity - O(n)
        //Space complexity - O(1)
        long S = 0, S2 = 0;
        long Sn = (n * (n+1))/2;
        long S2n = (n * (n+1) * (2*n+1))/6;
        for(int i=0;i<n;i++) {
            S += (long)arr[i];
            S2 += (long)arr[i] * (long)arr[i];
        }
        long val1 = Sn - S;
        long val2 = S2n - S2;
        val2 = val2 / val1;
        long y = (val1 + val2)/2;
        long x = val2 - y;
        return new int[] {(int)y, (int)x};
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

        int[] res = new int[2];
        res = findElement(arr,n);

        System.out.print("Missing number: "+res[0]);
        System.out.print("\nRepeating number: "+res[1]);

        sc.close();
    }
}
