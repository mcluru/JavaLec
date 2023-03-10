package chap05_class.example;

public class Singleton {
	
	public int a;
	//클래스(자기자신)를 객체화함
	//static. 인스턴스화 하기 전에 메모리에 Singleton 객체가 한개 생성됨.
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	//클래스 안에서 생성한 Singleton 객체를 어디서든지 참조할 수 있는 메소드
	//static 선언 이유 : 다시 Singleton 객체를 만들지 않고 생성되어있는 Singleton 객체를 사용하기 위해
	//다른 클래스에서 Singleton 객체를 생성하지 않고 호출가능한 함수
	public static Singleton getInstance() {
		//위에서 static으로 선언된 이미 메모리에 생성된 Singleton 객체를 리턴
		return singleton;
	}
	
	public void status() {
		System.out.println("a의 값은 : " + a);
	}
	
}
