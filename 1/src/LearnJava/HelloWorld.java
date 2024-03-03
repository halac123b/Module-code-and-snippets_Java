package LearnJava;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello world with Java");
		int a = 5;
		float f = 10.55f;
		System.out.printf("There are %d people have %.2f dollars", a, f);
		System.out.println("Concat string " + a);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Type in your age:");
		int age = scanner.nextInt();
		System.out.println("Type in your name:");
		String name = scanner.nextLine();
		scanner.close();
	}
}
