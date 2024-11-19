package test;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		int[] numbers = new int[6];
		
		System.out.println("숫자 6개를 입력하시오");
		for (int i=0; i<numbers.length; i++) {
			System.out.println((i+1) + "번째 숫자: ");
			numbers[i] = scanner.nextInt();
		}
		
		System.out.println("입력한 숫자들");
		for(int i =0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}
