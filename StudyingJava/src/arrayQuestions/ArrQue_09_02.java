package arrayQuestions;

import java.util.Scanner;

public class ArrQue_09_02 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("첫 번째 학생 이름: ");
		String studentName = scanner.nextLine();

		System.out.println("국어 점수: ");
		int koreanScore = scanner.nextInt();
		
		System.out.println("수학 점수: ");
		int mathScore = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.print("두 번째 학생 이름: ");
		String studentName2 = scanner.nextLine();
		
		
		
		System.out.println("국어 점수: ");
		int koreanScore2 = scanner.nextInt();
		
		System.out.println();
		
		System.out.println("수학 점수: ");
		int mathScore2 = scanner.nextInt();
		
        
        if (koreanScore > koreanScore2) {
            System.out.println("국어 1등: " + studentName);
        } else if (koreanScore < koreanScore2) {
            System.out.println("국어 1등: " + studentName2);
           
        } else {
            System.out.println("국어 과목 공동 1등 입니다 ");
        }
		
        
        if (mathScore > mathScore2) {
            System.out.println("수학 1등: " + studentName);
        } else if (mathScore < mathScore2) {
            System.out.println("수학 1등: " + studentName2);
           
        } else {
            System.out.println("수학 과목 공동 1등 입니다 ");
        }
        
	}
}
