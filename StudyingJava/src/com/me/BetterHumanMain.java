package com.me;

public class BetterHumanMain {
	public static void main(String[] args) {
		
		BetterHuman betterHuman1 = new BetterHuman();
		BetterHuman betterHuman2 = new BetterHuman();
		
		betterHuman1.name = "상현";
		betterHuman1.age = 27;
		betterHuman1.height = 180;
		
		betterHuman1.myName();
		betterHuman1.myAge();
		betterHuman1.myHeight();
		
		betterHuman1.information();
		
		betterHuman2.name = "성욱";
		betterHuman2.age = 35;
		betterHuman2.height = 185;
		
		betterHuman2.myName();
		betterHuman2.myAge();
		betterHuman2.myHeight();
		
		betterHuman2.information();
		
	}
}
