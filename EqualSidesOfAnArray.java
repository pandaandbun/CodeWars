/*You are going to be given an array of integers.
 *Your job is to take that array and find an index N where 
 *the sum of the integers to the left of N is equal to the sum of 
 *the integers to the right of N. If there is no index that would 
 *make this happen, return -1.
 */

/*
 * Set the the left and right sum variables as 0.
 * Have the right sum variable equal all elements within the array.
 * 
 * Loop through indexes the array, 
 * 
 * where the right sum - the element of that particular index
 * then compare the right and left.
 * If they equal then that index is correct and the loop stops.
 * 
 * If they do not then the left sum + the element of that index 
 * and move to the next index.
 * 
 * If none of the indexes are the correct one,
 * then the index is -1.
 */
public class EqualSidesOfAnArray {

	public static void main(String[] args) {
		
		int arr[] = {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4};

		int right = 0;
		int left = 0;

		//Sum of an array
		for (int i : arr) {
			right += i;
		}
		
		//Looping through the array
		for (int i = 0; i < arr.length; i++) {
			
			// The right sum - the element of index i
			right -= arr[i];
			
			//Compare left and right sum
			if (left == right) {
				System.out.println("Index: " + i);
				break;
			}
			
			// The left sum + the element of index i
			left += arr[i];
		}
		//The loop is done, meaning there are no correct index
		
		System.out.println("If there is nothing above me, Index = -1");
	}

}
