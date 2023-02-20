package chap07_inherit;

public interface Calculator {
	//추상메소드는 클래스에도 선언 가능.
	//클래스에 선언할 땐 abstract 키워드 사용 필수.(인터페이스에선 키워드 사용 불필요)
	//추상메소드는 상속받은 자식클래스에서 구현하여 사용함.
	public void calc(int a, int b);
}
