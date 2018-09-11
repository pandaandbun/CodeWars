
public class ComplementaryDNA {

	public static void main(String[] args) {
		
		String str = "ATTGC";
		String result = "";
		
		for (char c : str.toCharArray()) {
			if (c == 'A') {
				result += "T";
			} else if (c == 'T') {
				result += "A";
			} else if (c == 'G') {
				result += "C";
			} else if (c == 'C') {
				result += "G";
			}
		}
		
		System.out.println(result);
	}

}
