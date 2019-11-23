package _38_chicken;

import java.util.Scanner;

public class Main {

	public static void doFunc(int coupon, int stamp, int k, int ans) {
		if (coupon > 0) {
			coupon--;
			stamp++;
			ans++;
			doFunc(coupon, stamp, k, ans);
			return;
		} else if (stamp > 0){
		    if (stamp/k > 0) {
		    	stamp -= k;
		    	coupon++;
		    	doFunc(coupon, stamp, k, ans);
		    }
		}
		if (coupon == 0 && stamp/k == 0) {
			System.out.println(ans);
		}
	}
	
	public static void main(String[] args) {
		int k;
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		k = s.nextInt();
		int coupon = n;
		
		doFunc(coupon, 0, k, 0);
	}
	
	
	
}
