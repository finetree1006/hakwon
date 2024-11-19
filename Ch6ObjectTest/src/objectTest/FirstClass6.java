package objectTest;

public class FirstClass6 {

	void firstMethod() {
		secondMethod();
	}
	
	void secondMethod() {
		fourth(200);
	}
	
	void thirdMethod() {
		fourth(300);
	}
	
	void fourth(int n) {
		int temp = n;
		
		n++;
		temp++;
		
		System.out.println(temp + n);
		
	}
	
}
