package DynamicProgramming;
import java.util.Scanner;
public class comSequence {
    public static int stringSequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m+1][n+1];
        for(int i=1;i<=m;i++) {
            for(int j=1;j<=n;j++) {
                if(text1.charAt(i-1) == text2.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1] + 1;
                else 
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }

        int i = m, j = n;
        StringBuilder sb = new StringBuilder();
        while(i>0 && j>0) {
            if(text1.charAt(i-1)==text2.charAt(j-1)) {
                sb.insert(0, text1.charAt(i-1));
                i--;
                j--;
            }
            else if(dp[i-1][j]>dp[i][j-1])
                i--;
            else
                j--;
        }
        return sb.length();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text1: ");
        String text1 = sc.nextLine();
        System.out.print("Enter text2: ");
        String text2 = sc.nextLine();
        int len = stringSequence(text1,text2);
        System.out.println("Length of longest common subsequence: "+len);
        sc.close();
    }
}
