package test01_interface;

public class Test {
	public static void main(String[] args) {
		
		// 인터페이스로 객체 생성 : 불가능하다
//		MyInterface mi= new Myinterface();
		
		MyClass m = new MyClass();
		
		m.method1();
		m.method2();
		m.method3();
//		m.method4();
		Myinterface.method4();
		
		// 1. default 메서드끼리 겹친다면?
		// A implements B,C {}
		// - B, C 동일한 이름의 dafault 메서드 있다면
		// => 구현 클래스(A)에서 오버라이드를 해줘야 함!
		//	  오버라이드: B를 선택, C를 선택, 전혀 다른 메서드로 재정의
		
		// 2. default 메서드와 상위클래스의 메서드가 겹치는 경우
		// A extends B implements C
		// B의 메서드와 C의 default 메서드가 겹칠 때
		// => 기본적으로 B의 메서드를 사용
		// => 재정의할 수도 있다.
	}
	
}
