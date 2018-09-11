
public class NumberOfTrailingZerosOfFactorialN {

	public static void main(String[] args) {
		
		int divideBy = 5;
		int n = 12;
		int sum = 0;

		while (n >= divideBy) {
			sum += n / divideBy;
			divideBy *= 5;
		}
		
		System.out.println(sum);
	}
}
