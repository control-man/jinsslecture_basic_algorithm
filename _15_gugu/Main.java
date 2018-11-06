package _15_gugu;

public class Main {
	
	public static void main(String[] args) {
		int s = 2;
		int f = 5;
		// 2 ~ 5 Ãâ·Â
		
		for (int i = 1; i <= 9; i++) {
			for (int dan = s ; dan <= f ; dan++) {
				System.out.printf("%2d *%2d =%3d", dan, i, dan*i);
			}
			System.out.println();
		}
	}
	
}
