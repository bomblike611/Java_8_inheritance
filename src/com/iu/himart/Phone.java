package com.iu.himart;

public class Phone extends Himart{
	int pixel;
	
	public Phone() {
		
	}
	
	public Phone(String brand,int pixel,int price,int point) {
		this.brand=brand;
		this.pixel=pixel;
		this.price=price;
		this.point=point;
	}
	
	
	public void info() {
		super.info();
		System.out.println("Pixel : "+this.pixel+"만 화소");
		}
}
