package vendingMachineReturn;

public class Machine {

//	String printChoice(int choice) {
//		if (choice == 1) {
//			return "커피가 나왔습니다";
//		} else if (choice == 2) {
//			return "아이스티가 나왔습니다";
//		} else if (choice == 3) {
//			return "담배가 나왔습니다";
//		} else {
//			return "1, 2, 3 중에서 선택해주세요";
//		}
//	}

	String printChoice(int choice) {
//		String resultStr = "";
		String resultStr;
		if (choice == 1) {
			resultStr = "커피가 나왔습니다";
		} else if (choice == 2) {
			resultStr = "아이스티가 나왔습니다";
		} else if (choice == 3) {
			resultStr = "담배가 나왔습니다";
		} else {
			resultStr = "1, 2, 3 중에서 선택해주세요";
		}
		
		return resultStr;
	}
}
