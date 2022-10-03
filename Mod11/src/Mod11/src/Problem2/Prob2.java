package Problem2;
import java.util.Scanner;

public class Prob2 {
	public static void main(String[] args) {
		System.out.print("How much was the bill?");
		Scanner scanner = new Scanner(System.in);
		float bill = scanner.nextInt();
		System.out.printf("With a 10%% tip the tip would be %f and your total would be %f\n", bill*.1, bill*1.1);
		System.out.printf("With a 15%% tip the tip would be %f and your total would be %f\n", bill*.15, bill*1.15);
		System.out.printf("With a 20%% tip the tip would be %f and your total would be %f\n", bill*.20, bill*1.2);
		System.out.printf("With a 25%% tip the tip would be %f and your total would be %f\n", bill*.25, bill*1.25);
		System.out.print("What would you like your tip %% to be?\n");
		float tip = scanner.nextInt();
		System.out.printf("Your tip will be %f and your total will be %f\n", (tip*.01)*bill,((tip*.01)*bill)+bill);
		

}
}