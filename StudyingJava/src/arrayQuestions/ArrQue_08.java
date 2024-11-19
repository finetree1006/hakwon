package arrayQuestions;

import java.util.Scanner;

public class ArrQue_08 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("학생 이름: ");
		String studentName = scanner.nextLine();

		System.out.println("국어 점수: ");
		int koreanScore = scanner.nextInt();
		
		System.out.println("영어 점수: ");
		int englishScore = scanner.nextInt();
		
		System.out.println();
		System.out.println("== 출석부 ==");
        System.out.println("학생명: " + studentName);
        System.out.println("국어: " + koreanScore);
        System.out.println("영어: " + englishScore);
		
		
	}
}
