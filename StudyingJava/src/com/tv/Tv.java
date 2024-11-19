package com.tv;

public class Tv {
	
	int ch;
	boolean p;
	int vol;
	String color;
	
	
	void turnOn() {
		p = true;
		System.out.println("Tv켜짐");
	}
	
	void turnOff() {
		p = false;
		System.out.println("Tv종료");
	}
	
	void colRed() {
		color = "red";
		System.out.println("색은 " + color);		
	}
	
	void colBlue() {
		color = "blue";
		System.out.println("색은 " + color);
	}
	
	void information() {
		String tvInfoStr ="";
		
		tvInfoStr = "=========Tv정보=========\n";
		tvInfoStr += "채널\t:" + ch + "\n";
		tvInfoStr += "전원\t:" + p + "\n";
		tvInfoStr += "볼륨\t:" + vol + "\n";
		tvInfoStr += "색상\t:" + color + "\n";
		
		System.out.println(tvInfoStr);
	}
	
	
}
