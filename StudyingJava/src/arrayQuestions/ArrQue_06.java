package arrayQuestions;

import java.util.Scanner;

public class ArrQue_06 {
	public static void main(String[] args) {

		String[] students = { "보근", "진우", "무연", "민재", "하현", "유경", "병철", "상현" };

		Scanner scanner = new Scanner(System.in);

		System.out.println("학생의 이름을 입력하세요: ");
		String inputName = scanner.nextLine();

		boolean check = false;

		for (int i = 0; i < students.length; i++) {
			if (students[i].equals(inputName)) {

				check = true;
				break;
			}
		}
		if (check == true) {
			System.out.println(inputName + " 학생은 있습니다.");
		} else {
			System.out.println(inputName + " 학생은 없습니다.");
		}

	}
}
