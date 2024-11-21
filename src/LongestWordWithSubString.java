package src;

public class LongestWordWithSubString {
public static void main(String[] args) {
	String[] a1= {"CODGE","ODG","LODGES","SODG","dodge","mODj","LODGESSSS"};
	String toSearch="ODG";
	
	int longestWordWithSubstring = longestWordWithSubstring(a1,toSearch);
	System.out.println(longestWordWithSubstring);
	
	
}
public static int longestWordWithSubstring(String [] arr,String substring) {
	int maxlength=0;
	for(String word:arr) {
		if(word.contains(substring)) {
			maxlength=Math.max(maxlength, word.length());
		}
	}
	return maxlength;
	
}
}
