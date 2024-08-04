package test06_generic_box;


// 제네릭 클래스
// <>안에 타입 파라미터를 정해준다.
class Box <T>{
	private T t;
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t=t;
	}
}
public class BoxTest {
	public static void main(String[] args) {
		// 제네릭 클래스의 사용: 사용 시점에 타입 매개변수에 타입을 정해준다.
		Box<Integer> intbox = new Box<Integer>();
		Box<String> strbox = new Box<>(); // 생성자 호출 부분에서 타입을 생략할 수 있음.
		Box<Double> doubleBox = new Box<>();
		
		Box rawbox= new Box(); // 이렇게 쓰지 않는 것을 권장
		// 모든 것을 담을 수 있는 박스를 만들고 싶다면
		Box<Object> objBox = new Box<>();
		
		intbox.setT(43); // 타입 안정성을 높여준다.
		strbox.setT("Hello");
		String value = strBox.getT(); // 형변환의 필요가 없다. instanceof.
		
		// 제네릭에서 타입을 쓸 때, => 클래스로 써줘야 함.
		// 기본형: int, double, char, boolean => Wrapper 클래스를 사용해야 함.
		
		int i1=11; // 객체가 아님
		Integer i2=11; // autoboxing: 기본형값을 감싸서 자동으로 객체를 만들어
		//i2. 객체
		
		Integer i3=Integer.valueOf(123); // 메서드를 이용한 boxing
		
		int i4 = i2; //auto unboxing: 자동으로 객체가 기본형 변수로 바뀜
		//int i5= i3.intValue(); // 메서드를 활용한 unboxing
		
		
	}
}
