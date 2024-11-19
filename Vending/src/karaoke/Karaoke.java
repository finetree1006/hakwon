package karaoke;

public class Karaoke {
	
	public int volume = 10; // 기본 볼륨 10

	public String tambourine() {
		return "짤랑짤랑";
	}

	public String singing() {
		return "그래서 그대는! \n날 잊고 사는지";
	}


	public void volumeUp() {
		volume++;
	}

	public void volumeDown() {
		volume--;
	}

	public int volumeNow() {
		return volume;
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
        System.out.println("탬버린: \n" + tambourine());
        System.out.println("마이크: \n" + singing());
        System.out.println("스피커 볼륨: \n" + volumeNow());
    }
}
