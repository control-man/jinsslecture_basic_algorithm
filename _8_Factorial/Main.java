package _8_Factorial;

public class Main {

	public static void main(String[] args) {
		
		int inputNum = 7;
		int accNum = 1;
		// 5! = 5 * 4 * 3 * 2 * 1
		// 7! = 7 * 6 * 5 * 4 * 3 * 2 * 1
		
		for (int i = 1 ; i <= inputNum; i++) {
			accNum *= i;  // accNum = accNum * i;
		}
		
		System.out.println(accNum);
		
		accNum = 1;
		for (int i = inputNum ; i >= 1; i--) {
			accNum *= i;  // accNum = accNum * i;
		}
		
		System.out.println(accNum);
		
	}

}
