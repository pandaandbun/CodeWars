
public class PersistentBugger {

	public static void main(String[] args) {

		int num = 39, tmp = 0, result = 1, counter = 0;

		while (num > 9) {

			while (num > 0) {
				tmp = num % 10;
				result *= tmp;
				num /= 10;
			}

			num = result;
			result = 1;
			counter++;

			System.out.println(num + " " + counter);
		}

	}

}
