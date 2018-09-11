
public class Tribonacci {

	    public static void main(String[] args) {
	        int org[] = {0,0,1};
	        int n = 10;
	        int[] arr = new int[n];
	        
	        
		        for (int i = 0; i < org.length; i++) {
		        	arr[i] = org[i];
		        }
		        
		        for (int i = org.length; i < n; i++) {
		        	arr[i] = arr[i-3] + arr[i-2] + arr[i-1];
		        }
	        
	        for (int i = 0; i < n; i++) {
	        	System.out.print(arr[i] + " ");
	        }
	    }
}
