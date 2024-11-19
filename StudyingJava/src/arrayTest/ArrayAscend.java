package arrayTest;

import java.util.Arrays;

public class ArrayAscend {
	public static void main(String[] args) {
		// 숫자 5개가 있는데 총 25번(5*5)의 경우의 수를 오름차순으로 나열하기

		int[] numArr = { 5, 2, 3, 6, 8 };

		for (int i = 0; i < 100; i++) {
			int n = (int) (Math.random() * 5); // 다섯 개 숫자 중의 한 값을 임의로 얻는다
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}

		System.out.println(Arrays.toString(numArr));

		Arrays.sort(numArr);

		System.out.println("오름차순 정렬: " + Arrays.toString(numArr));
	}

}
