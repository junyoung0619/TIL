package test03_throws;

public class ThrowTest2 {
	// UncheckedException과 throws
	// - 컴파일러가 예외처리를 강제하지 않음.
	// - UncheckedException에게 throws는 아무런 의미가 없다.
	// 의미를 찾으려고 하지 말 것
	// - throws: 이번 한번만 봐줄게
	// UncheckedException: 예외를 처리하든말든 컴파일러가 신경쓰지 않고 원래 봐주는 애
	// 예외가 실행중에 발생하면, 프로그래머의 자율에 맡김
	public static void main(String[] args) {
		method1();
	}

	private static void method1() {
		try {
			method2();
		} catch(ArithmeticException e) {
			System.out.println("method 1에서 처리");
		}
	}

	private static void method2() {
		int i = 1/0; // ArithmeticException (UncheckedException)이 발생할 수 있음
		
	}
}
