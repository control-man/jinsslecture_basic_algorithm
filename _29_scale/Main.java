package _29_scale;

import java.util.Scanner;

public class Main {
	
	public static void distinc(int input[]) {
		
		boolean aFlag = true;
		boolean bFlag = true;
		
		if (input[0] != 1){
			aFlag = false;
		}
		for (int i = 1; i <input.length-1; i++){
			if(input[i] - input[i+1] != -1){
				aFlag = false;
				break;
			}
		}
		
		if (input[0] != 8){
			bFlag = false;
		}
		for (int i = 1; i <input.length-1; i++){
			if(input[i] - input[i+1] != 1){
				bFlag = false;
				break;
			}
		}
		if(aFlag)
			System.out.println("ascending");
		else if (bFlag)
			System.out.println("descending");
		else
			System.out.println("mixed");
		
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input[] = new int[8];
		
		for (int i = 0; i < input.length; i++) {
			input[i] = scan.nextInt();
		}
		
		distinc(input);
	}
}
