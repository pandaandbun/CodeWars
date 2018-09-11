
public class Multiplesof3or5 {

	public static void main(String[] args) {
		int num = 10, sum = 0;;
		
		for (int i = 1; i < num; i++) {
			if (i%3 == 0 || i%5 == 0) {
				sum += i;
			}
		}
		
		System.out.println(sum);
	}

}
