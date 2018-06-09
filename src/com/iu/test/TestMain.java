package com.iu.test;

public class TestMain {

	public static void main(String[] args) {
		//다형성 (polymorphism) -> 상속관계에서만 가능
		//primitive 형변환 가능 
		//
		
		/*double a=3.12;
		int n=(int) a;
		Child c=new Child();
		c.cNum=10;
		c.pNum=20;
		c.cMethod();
		c.pMethod();
		
		Parent p=new Child();
		p.pNum=20;
		p.pMethod();
		
		Child c2=(Child)p;*/
		
		Parent p=new Child();
		p.pNum=20;
		p.pMethod();
		
		Child c2=(Child)p;
		c2.pNum=20;
		c2.cNum=10;
		c2.cMethod();
		c2.pMethod();
		
		
		
	}

}
