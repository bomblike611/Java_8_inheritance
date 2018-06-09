package com.iu.himart;


public class Customer {
	int money;
	int point;
	
	
	public Customer(int money,int point) {
		this.money=money;
		this.point=point;
	}
	
	public void buy(Himart h) {//메인에서 형변환을 해주지 않아도 실행이됨. 왜냐하면 상속받았기때문에 Tv t는 Himart타입으로 불러올 수 있음
		this.money=this.money-h.price;
		this.point=this.point+h.point;
		System.out.println("==============================");
		System.out.println("현재 남은 돈 : "+money);
		System.out.println("현재 포인트 : "+point);
		if(h instanceof Tv) {
			System.out.println(((Tv)h).size);
		}else if(h instanceof Notebook) {
			System.out.println("notebook");
		}else {
			System.out.println("Phone");
		}
	}
	public void buy(Himart [] ar) {
		for(int i=0;i<ar.length;i++) {
		this.buy(ar[i]);
		}
	}
	
}
