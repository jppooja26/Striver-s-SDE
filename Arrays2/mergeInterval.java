import java.util.Scanner;
import java.util.Arrays;
class mergeInterval {
    public static void merge(int[][] intervals, int n) {
        //Time complexity - O(nlogn)
        //Space complexity - O(1)
        Arrays.sort(intervals, (a,b)-> a[0]-b[0]);
        for(int i=1;i<n;i++) {
            if(intervals[i-1][1]>intervals[i][0] && intervals[i-1][1]<intervals[i][1]) {
                intervals[i][1] = Math.max(intervals[i-1][1],intervals[i][1]);
                intervals[i][0] = intervals[i-1][0];
                intervals[i-1][0] = -1;
                intervals[i-1][1] = -1;
            }
        }
        System.out.print("Merged intervals: ");
        for(int i=0;i<n;i++) {
            if(intervals[i][0]!=-1) 
                System.out.print("{"+intervals[i][0]+","+intervals[i][1]+"} ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of intervals: ");
        int n = sc.nextInt();
        System.out.print("Enter intervals: ");
        int[][] intervals = new int[n][2];
        for(int i=0;i<n;i++) {
            for(int j=0;j<2;j++) {
                intervals[i][j] = sc.nextInt();
            }
        }
        merge(intervals,n);
        sc.close();
    }
}
