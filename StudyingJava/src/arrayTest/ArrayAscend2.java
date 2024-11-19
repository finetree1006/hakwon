package arrayTest;

public class ArrayAscend2 {
	public static void main(String[] args) {


		int[] numArr = { 8, 2, 3, 6, 5 };

		int temp = 0;
		
		int numOrder = 1;
		int first = 0;
		int second = 0;
		
		for (int i = 0; i < numArr.length; i++) {
			for (int n = 0; n < numArr.length; n++) {
				first = numArr[i];
				second = numArr[n];
				if(first < second) {
					temp = numArr[i];
					numArr[i] = numArr[n];
					numArr[n] = temp;					
				}
				System.out.print("order " + numOrder + ": ");
				for (int j = 0; j < numArr.length; j++) {
					System.out.print(numArr[j] + ", ");
					
				}
				System.out.println();	
				numOrder++;
			}
			
//			실행하면 나오는 25개의 출력문에 순서 부여하기
			
			
			
		} // for i end

//		for (int i = 0; i < numArr.length; i++) {
//			System.out.print(numArr[i] + ", ");
//		}
		
	}

}

