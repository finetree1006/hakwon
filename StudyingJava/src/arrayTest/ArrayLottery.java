package arrayTest;

import java.util.Scanner;

public class ArrayLottery {
	public static void main(String[] args) {

		int[] ball = new int[45];
		int[] userNums = new int[6];
		int[] lottoNums = new int[6];

		Scanner scanner = new Scanner(System.in);

		// 인덱스에 1~45의 값을 저장
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}

		// 배열을 셔플
		for (int i = 0; i < 6; i++) {
			int j = (int) (Math.random() * 45);
			int tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
		}

		// 배열 ball의 6개의 번호를 lottoNumbers에 할당
		for (int i = 0; i < 6; i++) {
			lottoNums[i] = ball[i];
		}

		// 위에서 만든 로또번호 출력
		System.out.println("로또 당첨 번호");
		for (int i = 0; i < lottoNums.length; i++) {
			System.out.print(lottoNums[i] + ", ");
		}

		System.out.println();

		// 숫자 6개를 스캐너로 입력받기
		System.out.println("숫자 6개를 입력하시오");
		for (int i = 0; i < userNums.length; i++) {
			System.out.println((i + 1) + "번째 숫자: ");
			userNums[i] = scanner.nextInt();
		}

		// 위에서 입력받은 6개의 숫자를 출력
		System.out.println("입력한 숫자들");
		for (int i = 0; i < userNums.length; i++) {
			System.out.print(userNums[i] + " ");
		}
		System.out.println();

		// 로또 번호하고 사용자 번호를 비교
		boolean winner = true;
		for (int i = 0; i < lottoNums.length; i++) {
			boolean found = false;
			for (int j = 0; j < userNums.length; j++) {
				if (lottoNums[i] == userNums[j]) {
					found = true;
					break;
				}
			}

			if (!found) {
				winner = false;
				break;
			}
		}

		if (winner) {
			
			System.out.println("1등입니다!");
		} else {
			
			System.out.println("당첨되지 않았습니다.");
		}

	}
}
