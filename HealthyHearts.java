import java.util.Scanner;

public class HealthyHearts {

	public static void main(String[] args) {
		int age, max;
		double lowerrange, upperrange;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input your age? ");
		age = Integer.parseInt(sc.next());
		max = 220 - age;// max is the max heart rate which is calculated by 220 - age
		lowerrange = max * 0.5;// calculating the upper and lower range of heart beats
		upperrange = max * 0.85;
		System.out.println("Your maximum heart rate should be " + max + " beats per minute"); //printing out the information
		System.out.println("Your target HR Zone is " + lowerrange + " - " + upperrange + " beats per minute");

	}

}
