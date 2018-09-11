import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dubstep {
	
	public static String songDecoder(String str) {
		
		String[] splitStr = str.split("WUB");
		
		List<String> strings = new ArrayList<String>(Arrays.asList(splitStr));
		String result = "";
		
		strings.removeAll(Arrays.asList("", null));
		
		for (String s : strings) {
			result += s + " ";
		}

		return result.trim();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(songDecoder("WUBWEWUBAREWUBWUBTHEWUBCHAMPIONSWUBMYWUBFRIENDWUB"));

	}

}
