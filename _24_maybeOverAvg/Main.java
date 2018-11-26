package _24_maybeOverAvg;

public class Main {
	
	public static void main(String[] args) {
		
		int in[] = {7, 100, 95, 90, 80, 70, 60, 50};
		
		int sum = 0;
		
		for (int i = 1; i < in.length; i++) {
			sum += in[i];
		}
		
		double avg = (double)sum / in[0];
		
		System.out.println(avg);
		
		int cnt = 0;
		
		for (int i = 1; i < in.length; i++) {
			if (in[i] > avg)
				cnt++;
		}
		
		//System.out.println(  cnt/in[0] );
		//System.out.println(  cnt/(double)in[0] );
		System.out.println(  cnt/(double)in[0] * 100  );
	}
}
