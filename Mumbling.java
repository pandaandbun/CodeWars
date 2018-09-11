
public class Mumbling {

	public static void main(String[] args) {

		String s = "abcd", result = "";

		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j >= 0; j--) {
				if (j == i) {
					result += Character.toUpperCase(s.charAt(i));
				} else {
					result += Character.toLowerCase(s.charAt(i));
				}
			}
			result += "-";
		}

		System.out.println(result.substring(0, result.length() - 1));

	}

}
