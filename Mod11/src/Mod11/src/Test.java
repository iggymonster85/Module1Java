import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.print("Give me a number between 1 and 10");
		Scanner scanner = new Scanner(System.in);
		int one=scanner.nextInt();
		System.out.print("another");
		int two=scanner.nextInt();
		System.out.print("and another");
		float three=scanner.nextInt();
		System.out.print("Now give me a number between 11 and 20");
		float four=scanner.nextInt();
		System.out.print("another");
		int five=scanner.nextInt();
		System.out.print("and the last one");
		int six=scanner.nextInt();
		System.out.printf("the first number multiplied by the second number is %d\n", one*two);
		System.out.printf("the third number divided by the fourth number is %f\n", three/four);
		System.out.printf("the fifth number plus the sixth number is %d\n", five+six);
	}

}
