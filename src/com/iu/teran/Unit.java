package com.iu.teran;

public abstract class Unit{
	int hp;
	int depence;
	int power;
	String color;
	
	public Unit(){
		
	}
	
	public void move() {}
	
	//추상메서드
	public abstract void attack();
}
