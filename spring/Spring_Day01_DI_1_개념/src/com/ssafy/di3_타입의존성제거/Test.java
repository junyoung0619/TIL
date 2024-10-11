package com.ssafy.di3_타입의존성제거;


//스프링컨테이너 맛보기!
//의존관계 역전 맛보기!
public class Test {
	public static void main(String[] args) {
		Desktop desktop = new Desktop();
		Laptop laptop = new Laptop();
		
		Programmer p = new Programmer(laptop);
		
		p.coding();
	}
}
