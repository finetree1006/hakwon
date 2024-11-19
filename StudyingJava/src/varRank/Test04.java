package varRank;

public class Test04 {
	public static void main(String[] args) {

		// 배열로 풀기

		int[] scoreIntArr = { 8, 5, 7, 0 };

		for (int i = 0; i < scoreIntArr.length; i++) {
			for (int j = 0; j < scoreIntArr.length; j++) {
				if (scoreIntArr[i] > scoreIntArr[j]) {

					int tempScore = scoreIntArr[i];
					scoreIntArr[i] = scoreIntArr[j];
					scoreIntArr[j] = tempScore;

				}

			}

		}
		for (int i = 0; i < scoreIntArr.length; i++) {
			System.out.println((i + 1) + ". " + scoreIntArr[i]);
		}

	}
}