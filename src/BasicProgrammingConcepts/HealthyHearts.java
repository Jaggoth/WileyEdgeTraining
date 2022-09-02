package BasicProgrammingConcepts;

import java.util.Scanner;

public class HealthyHearts {
	
	public static final int MAXAGE = 100;
	public static final int MINAGE = 1;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int age = 0;
		while (age < MINAGE || age > MAXAGE) {
			System.out.print("What is your age? ");
			try {
				age = Integer.parseInt(in.nextLine());
				}
				catch(Exception e) {
					age = 0;
				}
		}
		int maxHeartRate = 220 - age;
		System.out.println("Your maximum heart rate should be " +  maxHeartRate + " beats per minute");
		
		int LB = (int) Math.round(maxHeartRate * 0.5);
		int UB = (int) Math.round(maxHeartRate * 0.85);
		
		System.out.println("Your traget HR Zone is " + LB + " - " + UB + " beats per minute");
		
		

	}

}
