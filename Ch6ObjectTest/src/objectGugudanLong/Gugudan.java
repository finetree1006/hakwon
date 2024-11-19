package objectGugudanLong;

public class Gugudan {

	void printGugudan(int number) {
		// GugudanMain.java에 있는 number하고는 다른 number이다
		for (int i = 1; i <= 9; i++) {
			System.out.println(number + "*" + i + "=" + (number * i));
		}
	}

}
