// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int seed = Integer.parseInt(args[0]);
		String mode = args [1];
		if (mode.equals("c")) {
			System.out.println("Every one of the first "+seed+" hailstone sequences reached 1.");
		}
		else {
			int calc = 0;
		for (int i=1; i <= seed; i++) { 
			System.out.print(i+" ");
			int count = 1;
			int k = i;
			while (calc!=1) {
				if (k % 2 == 1) {
					calc = k * 3 + 1;
				}
				else {
					calc = k / 2;
				}
				System.out.print(calc+" ");
				count++;
				k = calc;
			}
			System.out.println("("+count+")");
			calc = 0;
		
		}
		System.out.println("Every one of the first "+seed+" hailstone sequences reached 1.");
	}
		
	}
}
