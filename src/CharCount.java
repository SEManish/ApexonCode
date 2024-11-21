package src;

public class CharCount {
public static void main(String[] args) {
	String input="aabbbcccdde";
	String convertString = convertString(input);
	System.out.println(convertString);
}	
	
	public static String convertString(String str) {
		StringBuilder result=new StringBuilder();
		int count=1;
		for(int i=0;i<str.length();i++) {
			if(i+1==str.length()||str.charAt(i)!=str.charAt(i+1)) {
				result.append(str.charAt(i));
				result.append(count);
				count=1;
			}else {
				count++;
			}
		}	
		return result.toString();
		
	}
	
	
	
	
	
	
	
	
}	

