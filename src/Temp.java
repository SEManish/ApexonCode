package src;

public class Temp {
	

//		Input: temperatures = [73,74,75,71,69,72,76,73]
//		Output: [1,1,4,2,1,1,0,0]
//		Example 2:
//
//		Input: temperatures = [30,40,50,60]
//		Output: [1,1,1,0]
//		Example 3:
//
//		Input: temperatures = [30,60,90]
//		Output: [1,1,0]
	
	
public static void main(String[] args) {
	int[] temperatures = {73,74,75,71,69,72,76,73};
	int[] dailyTemp = dailyTemp(temperatures);
	for (int i : dailyTemp) {
		System.out.println(i);
	}
}

public static int[] dailyTemp(int[] t) {
	int[] arr=new int[t.length];
	
	for(int i=0;i<t.length;i++) {
		int first=t[i];
		for(int j=i+1;j<t.length;j++) {
			if(t[j]>first) {
				arr[i]=j-i;
				break;
			}
		}
	}
	return arr;
	
}
}
