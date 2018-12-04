package _27_Dal;

public class Main {
	
	public static void main(String[] args) {
	/*
	 *  1  2  3  4  5
		16 17 18 19  6
		15 24 25 20  7
		14 23 22 21  8
		13 12 11 10  9
	 * 
	 * 
	 */
		
		int n = 4;
		int arr[][] = new int[10][10];
		
		
		int x = 0;
		int y = 0;
		int num = 1;
		int f = n;
				
		for (int i = 0; i < 2*n-1; i++) {
			switch (i % 4) {
			case 0: // right way
				for (int k = 0; k < f ;k++) {
					arr[y][x] = num;
					x++;
					num++;
				}
				x--;
				y++;

				f--;
				break;
			case 1: // under way
				for (int k = 0; k < f ;k++) {
					arr[y][x] = num;
					y++;
					num++;
				}
				y--;
				x--;
				break;
			case 2:  // left way
				for (int k = 0; k < f ;k++) {
					arr[y][x] = num;
					x--;
					num++;
				}
				x++;
				y--;
				
				f--;
				break;
			case 3:  // up way
				for (int k = 0; k < f ;k++) {
					arr[y][x] = num;
					y--;
					num++;
				}
				y++;
				x++;
				break;
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n ; j++){
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	
	}
}
