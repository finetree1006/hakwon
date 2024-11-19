package varRank;

public class Test02 {
	public static void main(String[] args) {
		int sangHyun = 70;
		int minJae = 20;
		int muYeon = 40;

		String first = "";
		String second = "";
		String third = "";

		if (sangHyun >= minJae && sangHyun >= muYeon) {
			first = "상현 (" + sangHyun + ")";
			if (minJae >= muYeon) {
				second = "민재 (" + minJae + ")";
				third = "무연 (" + muYeon + ")";
			} else {
				second = "무연 (" + muYeon + ")";
				third = "민재 (" + minJae + ")";
			}
		} else if (minJae >= sangHyun && minJae >= muYeon) {
			first = "민재 (" + minJae + ")";
			if (sangHyun >= muYeon) {
				second = "상현 (" + sangHyun + ")";
				third = "무연 (" + muYeon + ")";
			} else {
				second = "무연 (" + muYeon + ")";
				third = "상현 (" + sangHyun + ")";
			}
		} else {
			first = "무연 (" + muYeon + ")";
			if (sangHyun >= minJae) {
				second = "상현 (" + sangHyun + ")";
				third = "민재 (" + minJae + ")";
			} else {
				second = "민재 (" + minJae + ")";
				third = "상현 (" + sangHyun + ")";
			}
		}

		// 결과 출력
		System.out.println("1. " + first);
		System.out.println("2. " + second);
		System.out.println("3. " + third);
	}
}