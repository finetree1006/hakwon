package com.me;

public class HumanMain {
	public static void main(String[] args) {
		
		Human info = new Human();
		Human2 info2 = new Human2();
		
		info.name = "상현";
		info.age = 27;
		info.height = 180;
		
		info.myName();
		info.myAge();
		info.myHeight();
		
		info.information();
		
		info2.name = "성욱";
		info2.age = 35;
		info2.height = 185;
		
		info2.myName();
		info2.myAge();
		info2.myHeight();
		
		info2.information();
		
	}
}
