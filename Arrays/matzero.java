import java.util.Scanner;
public class matzero {
    public static int[][] zeromatrix(int[][] mat,int r,int c) {
        boolean[] row = new boolean[r];
        boolean[] col = new boolean[c];
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                if(mat[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                if(row[i]==true || col[j]==true)
                    mat[i][j] = 0;
            }
        }
        return mat;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int r = sc.nextInt();
        System.out.print("Enter column: ");
        int c = sc.nextInt();
        System.out.println("Enter matrix");
        int[][] mat = new int[r][c];
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        mat = zeromatrix(mat,r,c);
        System.out.println("Resultant matrix");
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}