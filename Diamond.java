
public class Diamond {

	public static void main(String[] args) {

		int n = 9;
		int odd = 1;
		int space = n / 2; // nos =number of spaces
		String result = "";

		for (int i = 1; i <= n; i++) { // for number of rows i.e n rows
			for (int j = space; j >= 1; j--) { // for number of spaces i.e
												// 3,2,1,0,1,2,3 and so on
				result += " ";
			}
			for (int k = 1; k <= odd; k++) { // for number of columns i.e
												// 1,3,5,7,5,3,1
				result += "*";
			}

			result += "\n";

			if (i < n / 2 + 1) {
				odd += 2; // columns increasing till center row
				space -= 1; // spaces decreasing till center row
			} else {
				odd -= 2; // columns decreasing
				space += 1; // spaces increasing

			}
		}

		System.out.println(result);
	}

}

/*
 * as you can see nos that is number of spaces needs to be decreased till center
 * row and number of stars needs to be increased but after center row its the
 * opposite , i.e spaces increase and stars decrease
 * 
 * size can be any number i set it to 9 over here so i will have a size 9 star
 * that is 9 rows and 9 columns max... number of space (nos) will be
 * 
 * 9/2 = 4.5
 * 
 * but java will take it as 4 because int can not store decimal numbers and
 * center row will be
 * 
 * 9/2 + 1 = 5.5
 * 
 * which will be taken as 5 in int.
 * 
 * so first you will make rows.. 9 rows hence
 * 
 * (int i=1;i<=size;i++)//size=9
 * 
 * then
 * 
 * print spaces like i did
 * 
 * (int k =nos; k>=1; k--) //nos being size/2
 * 
 * then finally stars
 * 
 * (int j=1; j<= odd;j++)
 * 
 * once line ends... you can adjust stars and spaces using if condition
 */
