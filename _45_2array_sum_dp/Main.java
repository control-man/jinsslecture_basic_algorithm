package _45_2array_sum_dp;
	
import java.util.*;

/*
 *     1 2 3 4
 *  1  1 1 1 1 
 *  2  2 2 2 2
 *  3  3 3 3 3 
 *  4  4 4 4 4
 *  
 *  dp[1][1] = 1
 *  dp[1][2] = dp[1][1] + num
 *  dp[1][3] = dp[1][2] + num
 *  dp[1][4] = dp[1][3] + num
 *  dp[2][1] = dp[1][1] + num 
 *  dp[2][2] = dp[1][2] + dp[2][1] + num - dp[1][1]
 *  dp[2][3] = dp[1][3] + dp[2][2] + num - dp[1][2]
 *  -> dp[i][j] = dp[i-1][j] + dp[i][j-1] + num - dp[i-1][j-1];
 *  
 *     [i,j]~[x,y]
 *  ex)[3,3]~[4,4]
 *   -> dp[4][4] - dp[4][2] - dp[2][4] + dp[2][2]
 *   -> dp[x][y]- dp[i-1][y] - dp[x][j-1] + dp[i-1][j-1]
 */ 

public class Main {
	
	
	public static void main(String[] args) {
		int dp[][] = new int[301][301];
		int a, b, num;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		for (int i = 1; i <= a ; i++) {
			for (int j = 1; j <= b; j++) {
				num = scan.nextInt();
				dp[i][j] = dp[i-1][j] + dp[i][j-1] + num - dp[i-1][j-1];
			}
		}
		
		int cnt, i, j, x, y;
		cnt = scan.nextInt();
		for (int k = 1; k <= cnt; k++) {
			i = scan.nextInt();
			j = scan.nextInt();
			x = scan.nextInt();
			y = scan.nextInt();
			System.out.println(dp[x][y]- dp[i-1][y] - dp[x][j-1] + dp[i-1][j-1]);
		}
	}
	
}
