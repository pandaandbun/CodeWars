
public class GetTheMiddleCharacter {

	public static void main(String[] args) {
		
		String str = "middle";
		
		if (str.length() % 2 == 0) {
			System.out.println(str.substring(str.length()/2 - 1, str.length()/2 + 1));
		}
		
		System.out.println(str.substring(str.length()/2, str.length()/2 + 1));

	}

}
