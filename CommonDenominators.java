public class CommonDenominators {

	private static long gcd(long a, long b) {
		while (b > 0) {
			long temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	private static long lcm(long a, long b) {
		return a * (b / gcd(a, b));
	}

	private static long lcm(long[] input) {
		long result = input[0];
		for (int i = 1; i < input.length; i++)
			result = lcm(result, input[i]);
		return result;
	}

	public static void main(String[] args) {

		long[][] lst = new long[][] { { 1, 2 }, { 1, 3 }, { 1, 4 } };
		long[] lst2 = new long[lst.length];
		long denom;
		String result = "";

		for (int i = 0; i < lst.length; i++) {
			lst2[i] = lst[i][1];
		}

		denom = lcm(lst2);

		for (long[] j : lst) {
			
			double firsDiv = (float) j[0] / j[1];
			
			while ((float) j[0] / denom < firsDiv) {
				j[0]++;
			}
			
			while ((float) j[0] / denom > firsDiv) {
				j[0]--;
			} 
			
			j[1] = denom;
			
			result += "(" + j[0] + "," + j[1] + ")";
		}
		
		System.out.println(result);
	}
}
