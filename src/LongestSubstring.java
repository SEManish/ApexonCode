package src;

public class LongestSubstring {

	    public static int[] findLongestSubstring(String str) {
	      
	        if (str == null || str.isEmpty()) {
	            return new int[]{-1, 0};
	        }

	        int maxLength = 1;  
	        int maxStartIndex = 0;  

	        int currentLength = 1;  
	        int currentStartIndex = 0;  

	        
	        for (int i = 1; i < str.length(); i++) {
	            if (str.charAt(i) == str.charAt(i - 1)) {
	                currentLength++;
	            } else {
	                if (currentLength > maxLength) {
	                    maxLength = currentLength;
	                    maxStartIndex = currentStartIndex;
	                }
	                currentLength = 1;
	                currentStartIndex = i;
	            }
	        }

	        if (currentLength > maxLength) {
	            maxLength = currentLength;
	            maxStartIndex = currentStartIndex;
	        }

	        return new int[]{maxStartIndex, maxLength};
	    }

	    public static void main(String[] args) {
	        String str = "aabbbbCCddd";
	        int[] result = findLongestSubstring(str);
	        System.out.println("Starting index: " + result[0] + ", Length: " + result[1]);
	    }
	}


