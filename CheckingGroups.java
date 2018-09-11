
public class CheckingGroups {

	public static void main(String[] args) {
		
		String s = "[{()}]";
		int len;
		
	    do {
	    	
	      len = s.length();
	      s = s.replace("()", "");
	      s = s.replace("{}", "");
	      s = s.replace("[]", "");
	      
	    } while (len != s.length());
	    
	    System.out.println(s.length() == 0);
	}
}
