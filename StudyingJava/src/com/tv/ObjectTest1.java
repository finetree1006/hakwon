package com.tv;

public class ObjectTest1 {
	public static void main(String[] args) {
		Tv1 t1;
		t1 = new Tv1();
		t1.channel = 7;
		System.out.println("Tv1의 현재 채널은 " + t1.channel + " 입니다");
		
		Tv2 t2;
		t2 = new Tv2();
		t2.channel = 10;
		System.out.println("Tv2의 현재 채널은 " + t2.channel + " 입니다");
	}
}

class Tv1 {
	String color; // 색상
	boolean power; // 전원상태(on/off)
	int channel; // 채널
	int volume; // 볼륨

	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel;}
	void volumeUp() { ++volume;}
	void volumeDown() { --volume;}
}

class Tv2 {
	String color; // 색상
	boolean power; // 전원상태(on/off)
	int channel; // 채널
	int volume; // 볼
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel;}
	void volumeUp() { ++volume;}
	void volumeDown() { --volume;}
}
