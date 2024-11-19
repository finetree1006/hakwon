package karaoke4;

public class Karaoke {

	public int volume; // 기본 볼륨 10
	public String tambourineSound;
	public String singingSound;

	public void tambourine() {
		System.out.println("탬버린: " + tambourineSound);
	}

	public void singing() {
		System.out.println("마이크: " + singingSound);
	}

	public void volumeUp() {
		volume++;
		System.out.println("스피커 볼륨 업: " + volume);
	}

	public void volumeDown() {
		volume--;
		System.out.println("스피커 볼륨 다운: " + volume);
	}

	public void volumeNow() {
		System.out.println("스피커 볼륨: " + volume);
	}

	public void showKaraokOption() {
		System.out.println("1. 탬버린");
		System.out.println("2. 마이크");
		System.out.println("3. 스피커");
		System.out.println("4. 정보");
		System.out.println("5. 종료");

		System.out.println("위 옵션 중 하나를 선택하세요 (1, 2, 3, 4, 5): ");
	}

	public void karaokeInfo() {
		System.out.println("탬버린: " + tambourineSound);
		System.out.println("마이크: " + singingSound);
		System.out.println("스피커 볼륨: " + volume + "\n");
	}
}
