package arrayTest;

import java.util.Scanner;

public class ArrayLottery3 {
	public static void main(String[] args) {

		int[] userNums = new int[6];
		int[] lottoNums = new int[6];

		Scanner scanner = new Scanner(System.in);

		// 로또 번호 생성
		for (int i = 0; i < 6; i++) {
			lottoNums[i] = (int) (Math.random() * 45) + 1;
		}

		// 당첨번호 출력
		System.out.println("당첨 번호");
		for (int i = 0; i < lottoNums.length; i++) {
			System.out.print(lottoNums[i] + " ");
		}
		System.out.println();

		// 숫자 6개 입력
		System.out.println("1~45 사이의 숫자 6개를 입력하세요");
		for (int i = 0; i < userNums.length; i++) {
			System.out.println((i + 1) + "번째 숫자:");
			userNums[i] = scanner.nextInt();
		}

		// 입력한 번호 출력
		System.out.println("입력한 번호");
		for (int i = 0; i < userNums.length; i++) {
			System.out.print(userNums[i] + " ");
		}
		System.out.println();

		// 로또 번호하고 사용자 번호를 비교
		boolean isWinner = true;
		for (int i = 0; i < userNums.length; i++) {
			boolean found = false;
			for (int j = 0; j < lottoNums.length; j++) {
				if (userNums[i] == lottoNums[j]) {
					found = true;
					break;
				}
			}
			if (!found) {
				isWinner = false;
				break;
			}
		}
		if (isWinner) {
			System.out.println("1등 당첨");
		} else {
			System.out.println("당첨 실패");
		}

	}
}
