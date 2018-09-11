import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlattenSortArray {

	public static void main(String[] args) {
		
		int[][] multiArray = {{3, 2, 1}, {4, 6, 5}, {9, 7, 8}};
		
		List<Integer> result = new ArrayList<>();
	    for(int[] firstLevel : multiArray){
	        for(int secondLevel : firstLevel){
	            result.add(secondLevel);
	        }
	    }
	    
	    Collections.sort(result);
	    
	    System.out.println(result);

	}

}
