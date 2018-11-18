package _20_369;

public class Main {
	
	public static int getNum (int i) {
		int j = 0;
		
		while (i > 0) {
			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9)
				j++;
			i /= 10;
		}
	
		
		return j;
	}
	public static void main(String[] args) {
		int n = 100;
		
		for (int i = 1; i <= n; i++) {
			int cnt = getNum(i);
			
			if (cnt == 0) {
				System.out.print(i+ " ");
			}
			else {
				for (int l = 0; l < cnt; l++) {
				 System.out.print("¦");
				}
				System.out.print(" ");
			}
		}
		
		
	}
}
