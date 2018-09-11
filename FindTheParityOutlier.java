
public class FindTheParityOutlier {

	public static void main(String[] args) {

		int arr[] = {160, 3, 1719, 19, 11, 13, -21};
		int even_counter = 0, odd_counter = 0, even = 0, odd = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even = arr[i];
				even_counter++;
			} else {
				odd = arr[i];
				odd_counter++;
			}
			
			//odd
			if (even_counter > 1 && odd_counter == 1) {
				System.out.println(odd);
				System.out.println(even_counter + " " + odd_counter);
				break;
			}
			
			//even
			if (odd_counter > 1 && even_counter == 1) {
				System.out.println(even);
				System.out.println(odd_counter + " " + even_counter);
				break;
			}
		}

	}

}
