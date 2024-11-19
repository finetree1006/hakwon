package objectEvenOdd;

public class EvenOddMain {
	public static void main(String[] args) {
		
		EvenOdd evenOdd = new EvenOdd();
		
		int number = 13;
		
		if(evenOdd.isEven(number)) {
			System.out.println(number + "은 짝수");
		} else {
			System.out.println(number + "은 홀수");
		}
		
		
	}
}
