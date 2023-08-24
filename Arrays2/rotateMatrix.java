import java.util.Scanner;
class rotateMatrix {
    public static void rotate(int[][] mat, int r, int c) {
        //Time complexity - O(r*c)
        //Space complexity - O(1)
        int left = 0, top = 0;
        int right = c-1, bottom = r-1;
        while(left<=right && top<=bottom) {
            int prev = mat[top+1][left];
            for(int i=left;i<=right;i++) {
                int curr = mat[top][i];
                mat[top][i] = prev;
                prev = curr;
            }
            top++;
            for(int i=top;i<=bottom;i++) {
                int curr = mat[i][right];
                mat[i][right] = prev;
                prev = curr;
            }
            right--;
            for(int i=right;i>=left;i--) {
                int curr = mat[bottom][i];
                mat[bottom][i] = prev;
                prev = curr;
            }
            bottom--;
            for(int i=bottom;i>=top;i--) {
                int curr = mat[i][left];
                mat[i][left] = prev;
                prev = curr;
            }
            left++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row length: ");
        int r = sc.nextInt();
        System.out.print("Enter column length: ");
        int c = sc.nextInt();
        System.out.println("Enter matrix elements");
        int[][] mat = new int[r][c];
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        rotate(mat,r,c);
        System.out.println("Final Matrix");
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}