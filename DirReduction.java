
public class DirReduction {

	public static void main(String[] args) {
		String[] arr = { "EAST", "EAST", "WEST", "NORTH", "WEST", "EAST", "EAST", "SOUTH", "NORTH", "WEST"};
		String[] arr2 = arr;
		String temp = "";
		
		for (int i = 0; i < arr.length; i++) {
			temp = "";
			for (String s : arr2) {temp += s + " ";}
			arr2 = temp.trim().split("NORTH\\s+SOUTH|SOUTH\\s+NORTH|WEST\\s+EAST|EAST\\s+WEST");
			if (arr2.length == 1 && arr2[0].equals("")) {
				break;
			}
		}
		
		arr2 = temp.trim().split("\\s+");
		
		for (String s : arr2) {
			System.out.println(s);
		}
	}
}