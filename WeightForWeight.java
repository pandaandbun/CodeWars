
public class WeightForWeight {

	private static int stringToInt(String e) {
		int num = 0;
		for (char c : e.toCharArray()) {
			num += c - '0';
		}
		return num;
	}

	public static void main(String[] args) {

		String str = "56 65 74 100 99 68 86 180 90";
		String arr[] = str.trim().split("\\s+");
		String result = "", temp;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (stringToInt(arr[i]) > stringToInt(arr[j])) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				if (stringToInt(arr[i]) == stringToInt(arr[j]) && arr[i].compareTo(arr[j]) > 0) {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
				}
			}
			result += arr[i] + " ";
		}

		System.out.println(result.trim());

	}

}
