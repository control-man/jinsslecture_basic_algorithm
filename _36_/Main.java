package _36_;

import java.util.Scanner;

public class Main {

	//17
	// 8..1
	// 4..0
	// 2..0
	// 1..0
	
	public static void decToBin(int N) {
		
		if (N/2 == 0) {
			System.out.print(N);
			return;
		}
		
		decToBin(N/2);
		System.out.print(N%2);
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		decToBin(input);
	}
	
	
	
}
