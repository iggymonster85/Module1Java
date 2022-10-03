package Mod1Prob3;

import java.util.Scanner;

public class Prob3 {
	public static void main(String[] args) {
		System.out.print("How many points did Diana score in game 1?");
		Scanner scanner = new Scanner(System.in);
		float game1 = scanner.nextInt();
		System.out.print("How many points did Diana score in game 2?");
		float game2 = scanner.nextInt();
		System.out.print("How many points did Diana score in game 3?");
		float game3 = scanner.nextInt();
		System.out.print("How many points did Diana score in game 4?");
		float game4 = scanner.nextInt();
		System.out.print("How many points did Diana score in game 5?");
		float game5 = scanner.nextInt();
		System.out.printf("Diana's average over 5 games was %f", (game1+game2+game3+game4+game5)/5);
		

}
}