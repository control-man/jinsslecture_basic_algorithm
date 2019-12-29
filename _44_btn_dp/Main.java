
package _44_btn_dp;
import java.util.*;

public class Main {

	/*  
	 *      1  2  3  4  5  6  7  8  9  10   
	 *      1  5  2  1  4  3  4  5  2  1  
	 * dpH  1  2  2  1  3  3  4  5  1  1                  
	 * dpL                       3
	 *      a  b  c  d 
	 */
	
	public static int getMax(int a, int b) {
		if (a > b)
			return a;
		else
			return b;
	}
	
	public static void main(String[] args) {
		int cnt;
		int input[] = new int[1001];
		Scanner scan = new Scanner(System.in);
		
		cnt = scan.nextInt();
		for (int i = 1; i <= cnt; i++) {
			input[i] = scan.nextInt();
		}
		
		int dpH[] = new int[1001];
		int dpL[] = new int[1001];
		for (int i = 1; i <= cnt; i++) {
			dpH[i] = 1;
			dpL[i] = 1;
		}
		
		for (int i = 2; i <= cnt; i++) {
			for (int j = i; j >= 1; j--) {
				if (input[j] < input[i]) {
					dpH[i] = getMax(dpH[i], dpH[j] + 1);
				} 	
			}
		}
		
		for (int i = cnt - 1; i >= 1; i--) {
			for (int j = i; j <= cnt; j++) {
				if (input[j] < input[i]) {
					dpL[i] = getMax(dpL[i], dpL[j] + 1);
				} 	
			}
		}

//		System.out.println();
//		for (int i = 1; i<=cnt; i++) {
//			System.out.print(dpH[i] + " ");
//		}
//		System.out.println();
//		for (int i = 1; i<=cnt; i++) {
//			System.out.print(dpL[i] + " ");
//		}
		int max = 0;
		for (int i = 1; i<=cnt; i++) {
			if (max < dpH[i] + dpL[i]) {
				max = dpH[i] + dpL[i];
			}
		}
		System.out.print(max - 1);
	}
}