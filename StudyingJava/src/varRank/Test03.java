package varRank;

public class Test03 {
	public static void main(String[] args) {

		// 배열로 풀기

		String[] nameStrArr = { "상현", "민재", "무연" };
		int[] scoreIntArr = { 70, 20, 40 };

		for (int i = 0; i < scoreIntArr.length - 1; i++) {
			for (int j = 0; j < scoreIntArr.length - 1 - i; j++) {
				if (scoreIntArr[j] < scoreIntArr[j + 1]) {

					int tempScore = scoreIntArr[j];
					scoreIntArr[j] = scoreIntArr[j + 1];
					scoreIntArr[j + 1] = tempScore;

					String tempName = nameStrArr[j];
					nameStrArr[j] = nameStrArr[j + 1];
					nameStrArr[j + 1] = tempName;
				}

			}

		}
		for (int i = 0; i < nameStrArr.length; i++) {
			System.out.println((i + 1) + ". " + nameStrArr[i] + ": " + scoreIntArr[i]);
		}

	}
}