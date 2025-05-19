package homework_array;

import java.util.Arrays;

public class Homework07 {

	public static void main(String[] args) {

		String[] report = {"Introduction", "Research", "Conclusion"};
		
		System.out.println("원본 보고서: " + report[0] + ", " + report[1] + ", " + report[2]);
		
		String[] newReport = Arrays.copyOf(report, report.length);
		newReport[0] = "Team Feedback";
		
		System.out.println("원본 보고서: " + newReport[0] + ", " + newReport[1] + ", " + newReport[2]);
		

		
		
	}

}
