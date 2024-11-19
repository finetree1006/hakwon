package inAHurry;

import java.util.Scanner;

public class Lottery {
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
    
        // 배열 ball의 6개의 번호를 lottoNums에 할당
        for (int i = 0; i < 6; i++) {
            lottoNums[i] = ball[i];
        }
        
        // 위에서 만든 로또번호 출력
        System.out.println("로또 당첨 번호:");
        for (int num : lottoNums) {
            System.out.print(num + " ");
        }
        
        System.out.println();
        
        // 숫자 6개를 스캐너로 입력받기
        System.out.println("숫자 6개를 입력하시오:");
        for (int i = 0; i < userNums.length; i++) {
            System.out.print((i + 1) + "번째 숫자: ");
            userNums[i] = scanner.nextInt();  // userNums에 입력값 저장
        }
        
        // 위에서 입력받은 6개의 숫자를 출력
        System.out.println("입력한 숫자들:");
        for (int num : userNums) {
            System.out.print(num + " ");
        }
        
        // 로또 번호와 사용자 입력 번호 비교
        boolean isWinner = true; // 일치 여부를 저장하는 변수
        for (int i = 0; i < lottoNums.length; i++) {
            if (lottoNums[i] != userNums[i]) {
                isWinner = false; // 일치하지 않으면 false로 설정
                break; // 더 이상 비교할 필요 없음
            }
        }

        // 결과 출력
        if (isWinner) {
            System.out.println("\n1등입니다!");
        } else {
            System.out.println("\n아쉽지만 당첨되지 않았습니다.");
        }

        scanner.close();  // Scanner 닫기
    }
}