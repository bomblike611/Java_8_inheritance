package com.iu.himart;

public class Tv extends Himart{
	
	int size;
	
	public Tv() {
		
	}
	
	public Tv(String brand,int size,int price,int point) {
		this.brand=brand;
		this.size=size;
		this.price=price;
		this.point=point;
	}
	
	
	public void info() {
		super.info();
		System.out.println("Size : "+this.size);
	}
}