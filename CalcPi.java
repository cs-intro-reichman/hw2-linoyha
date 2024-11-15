// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int num = Integer.parseInt(args[0]);
		int denominator = 3;
		double sum =1;
		for (int i=0; i<num; i++) {
			if (i % 2 == 0) {
				sum = sum - (double) 1 / denominator;
			}
			else {
				sum = sum + (double) 1 / denominator;
			}
			denominator = denominator + 2;
			i++;
			
		}

	}
}
