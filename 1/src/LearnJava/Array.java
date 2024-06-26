package LearnJava;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		String[] animals = { "duck", "goose", "chicken" };
		// Method to convert array to string "[duck, goose, chicken]"
		System.out.printf("The list is %s with length %d", Arrays.toString(animals), animals.length);
		// We can modify value in Java
		animals[2] = "bird";

		// Declare array trc mà chưa init giá trị (default là null)
		String[] array = new String[2];

		int[] arrayNumber = { 1, 3, 2 };
		// Sort array theo tăng dần
		/// Nhưng chỉ sort đc array number
		Arrays.sort(arrayNumber);
	}
}
