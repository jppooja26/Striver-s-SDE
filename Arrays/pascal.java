//Time complexity - O(n*n)
//Space complexity - O(n*n)
import java.util.Scanner;
public class pascal {
    public static int[][] traingle(int[][] tri,int n) { 
        for(int i=0;i<n;i++) {
            tri[i] = new int[i+1];
            tri[i][0] = 1;
            for(int j=1;j<i;j++) {
                tri[i][j] = tri[i-1][j-1] + tri[i-1][j];
            }
            tri[i][i] = 1;
        }
        return tri;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int n = sc.nextInt();
        int[][] tri = new int[n][];
        tri = traingle(tri,n);
        System.out.println("Resultant Pascal's Triangle");
        for(int i=0;i<tri.length;i++) {
            for(int j=0;j<tri[i].length;j++) {
                System.out.print(tri[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}