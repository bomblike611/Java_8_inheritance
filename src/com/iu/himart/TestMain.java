package com.iu.himart;

public class TestMain {

	public static void main(String[] args) {
		Notebook h=new Notebook("삼성", "i7", 20000000, 200);
		Tv h2=new Tv("LG",30,2600000,260);
		Phone h3=new Phone("아이폰",800,500000,5);
		
		
		/*Himart h=new Notebook("삼성", "i7", 20000000, 200);
		Himart h2=new Tv("LG",30,2600000,260);
		Himart h3=new Phone("아이폰",800,500000,5);
		
		Notebook n=(Notebook)h;
		Tv t=(Tv)h2;
		Phone p=(Phone)h3;
		
		Himart [] ar=new Himart[3];
		ar[0]=h;
		ar[1]=h2;
		ar[2]=h3;
		
		for(int i=0;i<ar.length;i++) {
			ar[i].info();
		}*/
		h.info();
		h2.info();
		
		Customer iu=new Customer(2000,0);
		iu.buy(h3);
		

	}

}
