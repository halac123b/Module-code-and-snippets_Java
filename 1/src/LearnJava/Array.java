package LearnJava;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		String[] animals = { "duck", "goose", "chicken" };
		// Method to convert array to string "[duck, goose, chicken]"
		System.out.printf("The list is %s with length %d", Arrays.toString(animals), animals.length);
		// We can modify value in Java
		animals[2] = "bird";
	}
}
