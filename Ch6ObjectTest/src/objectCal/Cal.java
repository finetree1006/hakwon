package objectCal;

public class Cal {

	void add(long a, long b) {
		long result = a + b;
		System.out.println("덧셈 결과: " + a + " + " + b + " = " + result);
//        return result;
	}

	void subtract(long a, long b) {
		long result = a - b;
		System.out.println("뺄셈 결과: " + a + " - " + b + " = " + result);
//        return result;
	}

	void multiply(long a, long b) {
		long result = a * b;
		System.out.println("곱셈 결과: " + a + " * " + b + " = " + result);
//        return result;
	}

	void divide(long a, long b) {
		double result = (double) a / b;

		result = Math.round(result * 100.0) / 100.0;
		System.out.println("나눗셈 결과: " + a + " / " + b + " = " + result);
//        return result;
	}

}
