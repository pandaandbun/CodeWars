
public class PredictAge {

	public static int predictAge(int gra1, int gra2, int gra3, int gra4, int gra5, int gra6, int gra7, int gra8) {
		
		int arr[] = {gra1, gra2, gra3, gra4, gra5, gra6, gra7, gra8};
		int total = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * arr[i];
			total += arr[i];
		}
	
		return (int) Math.sqrt(total)/2;
	}
	
	public static void main(String[] args) {
		
		System.out.println(predictAge(65, 60, 75, 55, 60, 63, 64, 45));

	}

}
