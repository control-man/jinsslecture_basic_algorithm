
package _41_make_one_dp;

import java.util.Scanner;

public class Main {

	static int[] ans = new int[1000001];

	// 1로만들기 최솟값 구하기
	// 3 나누고 (나누어 떨어질때)
	// 2 나누고
	// 1 뺴고
	// 10은 3
	public static void main(String[] args) {
		ans[2] = 1;
		ans[3] = 1;
		// ans[4]  = 2
		// ans[5] = 3
		// ans[6] = 2
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		for (int i = 4; i <= 1000000; i++) {
			int a = 99999, b = 99999, c = 99999;
			for (int w = 1; w <= 3; w++) {
				if (w == 1) {
					a = ans[i - 1];
				} else if (w == 2) {
					if (i % 2 == 0) {
						b = ans[i / 2];
					}
				} else if (w == 3) {
					if (i % 3 == 0) {
						c = ans[i / 3];
					}
				}
			}
			int min = min(a, b, c);
			ans[i] = 1 + min;
		}
		System.out.println(ans[input]);
	}

	public static int min(int a, int b, int c) {
		if (a < b) {
			if (a < c)
				return a;
			else
				return c;
		} else {
			if (b < c)
				return b;
			else
				return c;
		}
	}
}