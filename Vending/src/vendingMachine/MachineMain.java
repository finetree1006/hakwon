package vendingMachine;

import java.util.Scanner;

public class MachineMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Machine machine = new Machine();
		
		int choice = scanner.nextInt();
		
        machine.printChoice(choice);
	}
}
