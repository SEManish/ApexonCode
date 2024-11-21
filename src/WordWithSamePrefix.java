package src;

import java.util.ArrayList;
import java.util.List;

public class WordWithSamePrefix {
public static void main(String[] args) {
	String arr[]= {"apple", "app", "application", "banana", "band", "bat"};
	String search="app";
	List<String> stringWithPrefix = StringWithPrefix(arr,search);
	System.out.println(stringWithPrefix);
}


public static List<String> StringWithPrefix(String[] arr,String prefix){
	List<String> result=new ArrayList<>();
	for(String str:arr) {
		if(str.startsWith(prefix)) {
			result.add(str);
		}
	}
	
	return result;
	
}
}
