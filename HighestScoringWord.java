
public class HighestScoringWord {

	public static void main(String[] args) {
		
		String str = "take me to semynak";
		String[] splitStr = str.split("\\s+");
		int largestInt = -1;
		String largestString = "";
		
		for (String word : splitStr) {
			
			int current = 0;
			
			for (char ch : word.toCharArray()) {
				int pos = ch - 'a' + 1;
				current += pos;
			}
			
			if (largestInt < current) {
				largestInt = current;
				largestString = word;
			}
		}
		
		System.out.println(largestString);
	}

}
