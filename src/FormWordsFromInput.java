package src;


	import java.util.*;

	public class FormWordsFromInput {
	    
	    // Helper function to create a frequency map for a string
	    private static Map<Character, Integer> createFrequencyMap(String str) {
	        Map<Character, Integer> freqMap = new HashMap<>();
	        for (char c : str.toCharArray()) {
	            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
	        }
	        return freqMap;
	    }

	    // Function to check if a word can be formed from the input word
	    private static boolean canFormWord(String word, Map<Character, Integer> inputFreqMap) {
	        Map<Character, Integer> wordFreqMap = createFrequencyMap(word);
	        
	        for (char c : wordFreqMap.keySet()) {
	            if (wordFreqMap.get(c) > inputFreqMap.getOrDefault(c, 0)) {
	                return false;  // If the word requires more of any character than is available, return false
	            }
	        }
	        return true;
	    }

	    // Main function to find all valid words from the dictionary that can be formed
	    public static List<String> findWordsThatCanBeFormed(String[] dict, String input) {
	        // Create a frequency map for the input word
	        Map<Character, Integer> inputFreqMap = createFrequencyMap(input);

	        List<String> result = new ArrayList<>();
	        
	        // Iterate through the dictionary and check which words can be formed
	        for (String word : dict) {
	            if (canFormWord(word, inputFreqMap)) {
	                result.add(word);
	            }
	        }
	        
	        return result;
	    }

	    public static void main(String[] args) {
	        String[] dict1 = {"ab", "abcd", "bcdaf", "bcad", "acb", "acab"};
	        String input1 = "abcd";
	        System.out.println(findWordsThatCanBeFormed(dict1, input1));  // Output: [abcd, bcad]

	        String[] dict2 = {"ab", "abcd", "bcdaf", "bcad", "acaab", "acab"};
	        String input2 = "caab";
	        System.out.println(findWordsThatCanBeFormed(dict2, input2));  // Output: [acab]
	    }
	}



