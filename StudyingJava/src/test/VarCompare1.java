package test;

import java.util.Scanner;

public class VarCompare1 {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		
		boolean answer = false;
		answer = a == b;
		
		if (answer == true) {
			
			System.out.println("true");
		} else if (!answer) {
			System.out.println("false");
		}

	}
}
