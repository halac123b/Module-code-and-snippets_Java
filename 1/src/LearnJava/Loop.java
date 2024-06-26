package LearnJava;

public class Loop {
	public static void main(String[] args) {
		// Vòng for thường
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}

		int u = 0;
		// While loop
		while (u < 5) {
			if (u == 4) {
				continue;
			}
			System.out.println(u);
			u++;
		}

		// Do-while loop
		do {
			System.out.println(u);
			if (u >= 2) {
				break;
			}
			u--;
		} while (u > 0);

		int[] array = { 1, 2, 3 };
		for (int i : array) {
			System.out.printf("Item %d: %d", i, array[i]);
		}
	}
}
