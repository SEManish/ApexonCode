package src;
import java.util.HashMap;
import java.util.Map;

public class CharCountHashMap {
	public static void main(String[] args) {
		String s="aaabbcccd";
		char[] charArray = s.toCharArray();
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(char c:charArray) {
			if(!map.containsKey(c)) {
				map.put(c,1);
			}else{
				int value=map.get(c);
				map.put(c, value+1);				
			}
		}
		System.out.print(map);
	}
}












//import java.util.Map;
//import java.util.HashMap;
//
//public class CharCountHashMap {
//    public static void main(String[] args) {
//        String s = "aaabbcccd";
//        char[] charArray = s.toCharArray();
//        Map<Character, Integer> map = new HashMap<>();
//
//        // Count occurrences of each character
//        for (char c : charArray) {
//            map.put(c, map.getOrDefault(c, 0) + 1);
//        }
//
//        // Create a result string in the desired format
//        StringBuilder result = new StringBuilder();
//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            result.append(entry.getKey()).append(entry.getValue());
//        }
//
//        // Output the result
//        System.out.print(result.toString());
//    }
//}









