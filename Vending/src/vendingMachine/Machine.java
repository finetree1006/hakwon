package vendingMachine;

public class Machine {

	void printChoice(int choice) {
		if (choice == 1) {
			System.out.println("커피가 나왔습니다");
		} else if (choice == 2) {
			System.out.println("아이스티가 나왔습니다");
		} else if (choice == 3) {
			System.out.println("담배가 나왔습니다");
		} else {
			System.out.println("1, 2, 3 중에서 선택해주세요");
		}
	}
}
