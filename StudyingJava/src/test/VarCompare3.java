package test;

import java.util.Scanner;

public class VarCompare3 {

	public static void main(String[] args) {
		
		int[] numArr = new int[3];
		
		int varNum = 0;
		
		for(int i = 0; i < numArr.length; i++) {
			if(numArr[i] == varNum) {
				System.out.println(true);
			} else if (numArr[i] != varNum) {
				System.out.println(false);
			}
		}
					
//		if(numArr[0] == varNum) {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}
//		
//		if(numArr[1] == varNum) {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}
//		
//		if(numArr[2] == varNum) {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}
	}
}
