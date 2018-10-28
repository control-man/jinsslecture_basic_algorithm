package _10_numRec1_;

public class Main {

	public static void main(String[] args) {
		
		int n = 5;
		
		/*  n = 3
		 *  1 2 3 
		 *  4 5 6
		 *  7 8 9
		 */
		//int num = 1;
		
		for (int j = 0; j < n ; j++) {
			
			for (int i=0; i < n ; i++) {
				System.out.printf("%4d", j*(n) + i + 1);
				//num++;
				//System.out.print(j*(n) + i + 1 + " ");
			}
			System.out.println();
		}


	}

}
