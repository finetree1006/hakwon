package objectGugudanLong;

import java.util.Scanner;

public class GugudanMain {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();

		Gugudan gugudan = new Gugudan();

		gugudan.printGugudan(number);

	}
}
