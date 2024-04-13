package LearnJava;

public class Loop {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}

		int u = 0;
		while (u < 5) {
			if (u == 4) {
				continue;
			}
			System.out.println(u);
			u++;
		}

		do {
			System.out.println(u);
			if (u >= 2) {
				break;
			}
			u--;
		} while (u > 0);
	}
}
