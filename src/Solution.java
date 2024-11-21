package src;

	import java.util.*;

	class Solution {
	  public static void main(String[] args) { 
	    student();
	    
	  }

	  public static void student(){
	    String [][] arr1={{"Charles","84"},
	                {"John", "100"},
	                {"Andy", "37"},
	                {"John", "23"},
	                {"Charles", "20"}};
	Map<String, int[]> map = new HashMap<String, int[]>();
	for(var student:arr1){
	  String name=student[0];
	  int marks=Integer.parseInt(student[1]);
	  map.putIfAbsent(name, new int[2]);
	  map.get(name)[0]+=marks;
	  map.get(name)[1]++;
	  
	  System.out.println(map);
	}
	double studentAvgMarks=Integer.MIN_VALUE;
	String studentName="";
	for(var i:map.entrySet()){
	int totalMarks=i.getValue()[0];
	int totalSubject=i.getValue()[1];
	double avg=(double)totalMarks/totalSubject;
	if(avg>studentAvgMarks){
	  studentAvgMarks=avg;
	  studentName=i.getKey();
	}
	}
	System.out.println(studentName+" "+studentAvgMarks);
	  }
	}

