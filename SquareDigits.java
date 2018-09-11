
public class SquareDigits {

	public static void main(String[] args) {
		
		String result = "";
		
		// separate each digits into characters
		for (char c : String.valueOf(9119).toCharArray()) {

			// convert character into integer
			int beforeSquared = c - '0';
			int squared = (int) Math.pow(beforeSquared, 2);
			
			// convert integer to character
			String afterSquared = String.valueOf(squared);
			
			result += afterSquared;
		}
		
		System.out.print(result);
	}

}
