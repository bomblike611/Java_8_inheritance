package com.iu.himart;

public class Notebook extends Himart{
	String cpu;
	
	public Notebook() {
		
	}
	
	public Notebook(String brand,String cpu,int price,int point) {
		//super(); 이게 생략되어있음. 실제로는 부모의 생성자를 호출함
		this.brand=brand;
		this.cpu=cpu;
		this.price=price;
		this.point=point;
	}
	
	
	public void info() {
		super.info();
		System.out.println("Cpu : "+this.cpu);
		
	}
	
}
