package karaoke4;

import java.util.Scanner;

public class KaraokeMain {
	public static void main(String[] args) {
		Karaoke karaoke = new Karaoke();
		Scanner scanner = new Scanner(System.in);

		karaoke.tambourineSound = "짤랑짤랑";
		karaoke.singingSound = "그래서 그대는!" + "\n" + "날 잊고 사는지";
		karaoke.volume = 10;
		
		while (true) {

			karaoke.showKaraokOption();

			int userInput = scanner.nextInt();


			if (userInput == 1) {
				karaoke.tambourine();
			} else if (userInput == 2) {
				karaoke.singing();
			} else if (userInput == 3) {
				System.out.println("1를 입력하면 볼륨업\n2를 입력하면 볼륨다운");

				int volumeControl = scanner.nextInt();

				if (volumeControl == 1) {
					karaoke.volumeUp();
				} else if (volumeControl == 2) {
					karaoke.volumeDown();
				} else {
					System.out.println("1 또는 2를 입력해주세요");
				}

			} else if (userInput == 4) {
				karaoke.karaokeInfo();
			} else if (userInput == 5) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("1, 2, 3, 4, 5 중에 하나를 골라주세요");
			}
		}
	}
}
