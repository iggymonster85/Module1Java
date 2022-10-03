package Prob4;
import java.util.Scanner;

public class Prob4 {
	public static void main(String[] args) {
		System.out.print("Give me a number");
		Scanner scanner = new Scanner(System.in);
		int number1 = scanner.nextInt();
		System.out.print("Give me another number");
		int number2 = scanner.nextInt();
		System.out.printf("If you add both numbers you get %d\n", number1+number2);
		System.out.printf("If you subract the first number from the second you get %d\n", number1-number2);
		System.out.printf("If you multiply both number you get %d\n", number1*number2);
		System.out.printf("If you divide the second number by the first number you get %d\n", number2/number1);

}
}