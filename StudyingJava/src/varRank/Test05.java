package varRank;

public class Test05 {
    public static void main(String[] args) {
    	
    	// 4개의 숫자 중에서 가장 큰 수와 가장 작은수 나타내기
    	
        int[] numberIntArr = { 70, 20, 40, 50 };
        
        
        int numMax = numberIntArr[0];
        int numMin = numberIntArr[0];

       
        for (int i = 0; i < numberIntArr.length; i++) {
            
            if (numberIntArr[i] > numMax) {
            	numMax = numberIntArr[i];
            }
            if (numberIntArr[i] < numMin) {
            	numMin = numberIntArr[i];
            }
        }

       
        System.out.println("가장 큰 수: " + numMax);
        System.out.println("가장 작은 수: " + numMin);
    }
}

