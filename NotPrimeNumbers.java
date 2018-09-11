import java.util.*;

public class NotPrimeNumbers {

	public static boolean isPrime(int n) {
	    
		if (n == 2) return true;
	    if (n % 2 == 0 || n < 2) return false;
	    
	    for(int i = 3; i * i <= n; i += 2) {
	        if( n%i == 0)
	            return false;
	    }
	    return true;
	}
	
	public static boolean EveryDigitIsPrime(int n) {
		
		int temp = 0;
		while (n > 0) {
			temp = n % 10;
			if (!isPrime(temp)) {
				return false;
			}
			n /= 10;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		int first = 2;
		int last = 222;
		List<Integer> prime = new ArrayList<>();

		for (int i = first; i < last; i++) {
			if (!isPrime(i) && EveryDigitIsPrime(i)) {
				prime.add(i);
			}
		}
		
		System.out.println(prime);
	}

}
