package arrayQuestions;

import java.util.Scanner;

public class ArrQue_07 {
	public static void main(String[] args) {
		
		String[] students = { "보근", "진우", "무연", "민재", "하현", "유경", "병철", "상현" };
		
		int[] koreanScores = {97, 80, 70, 100, 60, 90, 50, 100};
		int[] englishScores = {96, 85, 75, 90, 65, 92, 55, 100};
		int[] mathScores = {90, 90, 80, 95, 70, 88, 60, 100};
		
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. 총점 2. 평균 3. 등수");
			int select = scanner.nextInt();
			
			if(select == 1) {
				//총점
				System.out.println("이름\t국어\t영어\t수학\t총점\n");

				for(int i = 0; i< students.length; i++) {
					int total = koreanScores[i] + englishScores[i] + mathScores[i];
					
					System.out.println((i+1) + "."+ students[i] + "\t"+ koreanScores[i]+ "\t" + englishScores[i]
							+ "\t" + mathScores[i] + "\t"  + total);
				}
			} else if(select == 2) {
				// 평균
				for(int i=0; i <students.length; i++) {
					double average = (koreanScores[i] + englishScores[i] + mathScores[i]) / 3.0;
					System.out.println((i+1) + "." + students[i] + Math.ceil(average * 100) / 100.0);
				}
			} 
				else if(select == 3) {
				// 등수
				for(int i = 0; i< students.length; i++) {
					int total = koreanScores[i] + englishScores[i] + mathScores[i];
					System.out.println((i+1) + "."+ students[i] + "\t"  + total);
				}
			}
			
			
		}
	}
}
