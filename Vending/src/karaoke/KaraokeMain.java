package karaoke;

import java.util.Scanner;

public class KaraokeMain {
	public static void main(String[] args) {
		Karaoke karaoke = new Karaoke();
		Scanner scanner = new Scanner(System.in);

		while (true) {

			karaoke.showKaraokOption();

			int userInput = scanner.nextInt();

//		System.out.println("1. 탬버린");
//		System.out.println("2. 마이크");
//		System.out.println("3. 스피커");
//		System.out.println("번호를 선택하세요");

			if (userInput == 1) {
				System.out.println("탬버린: " + karaoke.tambourine());
			} else if (userInput == 2) {
//			System.out.println("마이크: ");
				System.out.println(karaoke.singing());
			} else if (userInput == 3) {
//			System.out.println("스피커 볼륨 조절");
				System.out.println("1를 입력하면 볼륨업\n2를 입력하면 볼륨다운");

				int volumeControl = scanner.nextInt();

				if (volumeControl == 1) {
					karaoke.volumeUp();
					System.out.println("스피커 볼륨 업: " + karaoke.volumeNow());
				} else if (volumeControl == 2) {
					karaoke.volumeDown();
					System.out.println("스피커 볼륨 다운: " + karaoke.volumeNow());
				} else {
					System.out.println("1 또는 2를 입력해주세요");
				}

			} else if (userInput == 4) {
				karaoke.karaokeInfo();
			} else if(userInput == 5){
				break;
			} else {
				System.out.println("1, 2, 3, 4, 5 중에 하나를 골라주세요");
			}
//		
		}
	}
}
