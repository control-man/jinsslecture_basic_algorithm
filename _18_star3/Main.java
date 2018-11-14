package _18_star3;

public class Main {
	public static void main(String[] args) {
		int n = 5;
		 /*
		 		*
		 	   **
		 	  ***
		 	 ****
		 	*****
		 */
		for (int i = 0; i < n ; i++) {
			for (int j = 0 ; j < n; j++) {
				if (i < n - (j + 1))
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
