package chap05_class.clac;

public class Minus {
	
	//num3까지는 같은패키지 내의 클래스에선 무조건 사용 가능
	//멤버변수 : 객체가 가진 고유특성 -> 다른 클래스에서 접근해서 변경할 수 있으면 고유의 특성이 사라지는 경우 발생. ->멤버변수는 주로 private으로 선언함
	//멤버변수의 값을 사용할 땐 getter라는 메소드 사용하여 값을 다른 클래스에서 가져감.
	//private 멤버변수의 값 변경할 땐 setter 메소드를 사용해 변경.
	public int num1;
	protected int num2;
	int num3;
	//num4는 Minus 클래스에서만 사용가능
	private int num4;
	
	
	public int minu(int a, int b) {
		return a - b;
	}

	//private 멤버변수의 값을 가져오는 getter메소드
	public int getNum4() {
		return num4;
	}

	//private 멤버변수의 값을 변경하는 setter메소드
	public void setNum4(int num4) {
		//this는 이 객체를 의미(Minus 객체를 가리킴)
		this.num4 = num4;
	}
	
	
	
}
