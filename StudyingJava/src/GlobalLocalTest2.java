public class GlobalLocalTest2 {
	
	int globalNum = 10;
	static int globalNum2 = 20;
	
	public void numbering(){
		int localNum = 30;
		
		System.out.println("globalNum= " + globalNum);
		System.out.println("globalNum2= " + globalNum2);
		System.out.println("localNum= " + localNum);
	}
	
	System.out.println("globalNum= " + globalNum);
	System.out.println("globalNum2= " + globalNum2);
	System.out.println("localNum= " + localNum);
	
}
