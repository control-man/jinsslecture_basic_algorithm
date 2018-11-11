package _17_star2;

public class Main {
	
	public static void main(String[] args) {
		
		int n = 7;
		/*
		 *   *****
		 *    ****
		 *     ***
		 *      **
		 *       *
		 */
		
		for (int i = 0; i < n ; i++) {
			for (int j = 0 ; j < n; j++) {
				if (i > j) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
	}
	
}
