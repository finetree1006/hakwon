package com.me;

public class BetterHuman {
	
	String name;
	int age;
	int height;
	
	void myName() {
		
		System.out.println("이름은 " + name);
	}
	
	void myAge() {
		
		System.out.println("나이는 " + age);
	}
	
	void myHeight() {
	
		System.out.println("키는 " + height);
	}
	
	void information() {
		String myInfoStr = "";
		
		myInfoStr = "=============내 정보=============\n";
		myInfoStr += "이름\t" + name + "\n";
		myInfoStr += "나이\t" + age + "\n";		
		myInfoStr += "키\t" + height + "\n";
		
		System.out.println(myInfoStr);
	}
	
}