package vendingMachineReturn;

import java.util.Scanner;

public class MachineMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Machine machine = new Machine();
		
		System.out.println("원하는 상품을 선택하세요");
		int choice = scanner.nextInt();
		
        System.out.println(machine.printChoice(choice));
	}
}
