package Prob5;
import java.util.Scanner;


public class Prob5 {
	public static void main(String[] args) {
		System.out.print("What is your age?");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		if (age < 0) {
			System.out.println("Invalid age");
		}
		if (age >= 16) {
			System.out.println("You can drive");
		}
		if (age >= 18) {
			System.out.println("You can vote");
		}
		if (age >= 21) {
			System.out.println("You can enjoy a beer");
		}
		if (age >= 55) {
			System.out.println("You get the senior discount");
		}

}
}