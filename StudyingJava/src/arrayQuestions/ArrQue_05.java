package arrayQuestions;

public class ArrQue_05 {

	public static void main(String[] args) {
		
		int[] countArr = new int[5];
		
		int sum = 0;
		
		
		for (int i = 0; i < 5; i++) {
			countArr[i] = (int)(Math.random() * 100) + 1;			
		}
		
		
		for (int i = 0; i < countArr.length; i++) {
			System.out.println("숫자 : " + countArr[i]);
		}
		
		for(int i=0; i < countArr.length; i++) {
			
			if(i ==0 && countArr[i] > 30) {
//				System.out.println(sum + "(30 초과)"); // 수정 필요 
				
				break;
			}
			
			
			if(sum + countArr[i] > 30) {
				
				if(i>0) {
					System.out.println("더했을 때 30이 되기 직전의 숫자: " + countArr[i -1]);
				} 
				
				break;
			}
			
			sum = countArr[i] + sum;
		}
 		
	
		
		System.out.println("최종 누적 합계: " + sum);
 		
	}
}
