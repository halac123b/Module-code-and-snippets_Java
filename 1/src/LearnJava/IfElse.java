package LearnJava;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input your income");
		int income = scan.nextInt();
		int tax = 0;

		if (income < 10) {
			tax = 0;
		} else if (income >= 10 && income < 15) {
			tax = 10;
		}
		System.out.println("Your tax is " + tax + "%");
	}
}
