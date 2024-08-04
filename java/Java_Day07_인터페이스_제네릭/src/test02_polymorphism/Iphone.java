package test02_polymorphism;

public class Iphone implements AlarmSound{

	@Override
	public void playAlarm() {
		System.out.println("Beep beep beep");
		
	}

}
