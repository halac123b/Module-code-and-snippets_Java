package LearnJava;

public class SwitchCase {
	public static void main(String[] args) {
		int a = 5;
		switch (a) {
		case 1: {
			System.out.print("Number 5");
			break;
		}
		case 2: {
			System.out.print("Number 2");
			break;
		}
		default:
			System.out.print("Exception case");
			System.exit(0);
		}
	}
}
