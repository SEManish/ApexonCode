package src;

import java.util.HashMap;
import java.util.Map;

public class HighestAverageMarks {
	    public void call() {
	        String[][] cv = {{"Charles", "84"},
	                {"John", "100"},
	                {"Andy", "37"},
	                {"John", "23"},
	                {"Charles", "20"}};

	        Map<String, int[]> map = new HashMap<>();

	        for (var student : cv) {
	            String name = student[0];
	            int marks = Integer.parseInt(student[1]);

	            map.putIfAbsent(name, new int[2]);
	            map.get(name)[0] += marks;
	            map.get(name)[1]++;
	        }

	        double studentAvgMarks = Integer.MIN_VALUE;
	        String studentName = "";
	        for (var i : map.entrySet()) {
	            int totalMarks = i.getValue()[0];
	            int totalSubjects = i.getValue()[1];
	            double avg = (double) totalMarks / totalSubjects;
	            if (avg > studentAvgMarks) {
	                studentAvgMarks = avg;
	                studentName = i.getKey();
	            }
	        }

	        System.out.println(studentName + " " + studentAvgMarks);
	    }
public static void main(String[] args) {
	HighestAverageMarks ham=new HighestAverageMarks();
	ham.call();
}
	}

