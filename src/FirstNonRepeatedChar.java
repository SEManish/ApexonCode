package src;

public class FirstNonRepeatedChar {
public static void main(String[] args) {
	String input="AAABCDBE";
	
	for(int i=0;i<input.length();i++) {
		boolean unique=true;
		
	for(int j=0;j<input.length();j++) {
		if(i!=j && input.charAt(i)==input.charAt(j)) {
			unique=false;
		}
	}
	if(unique) {
		System.out.println(input.charAt(i));
		break;
	}
	
	}					
}
	
}
