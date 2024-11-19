package com.tv;

public class TvMain {
	public static void main(String[] args) {
		
		Tv tv1 = new Tv();
		tv1.ch = 7;
		tv1.p = true;
		tv1.vol = 1;
		tv1.color = "red";
		
		tv1.information();
		
		tv1.turnOn();
		tv1.colRed();
	}
}
