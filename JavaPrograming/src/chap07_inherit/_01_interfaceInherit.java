package chap07_inherit;

public class _01_interfaceInherit {

	public static void main(String[] args) {
		//1. 다형성의 기초
		//동일한 부모를 상속받은 클래스 두 개 선언
		//둘 다 동일한 부모로부터 상속받은 calc라는 메소드를 구현
		Add add = new Add();
		Minus min = new Minus();
		
		//동일한 calc메소드 호출
		//다형성의 기초 : 동일한 이름의 메소드를 상속받아도 전혀 다른 결과값을 낼 수 있음. 동일한 메소드로 여러개의 기능 구현 가능
		add.calc(1, 2);
		min.calc(1, 2);
		
		//Add가 Calculator를 상속받았기에 Add는 Calculator의 모양도 가지고 있으면서 Add마느이 형태고 가지고 있음.
		Calculator cal = add; //또는 Calculator cal = new Add(); but! 원래 있는 객체 쓰는게 메모리 절약에 도움됨
		
		//덧셈이 필요할 때는 Add를 cal에 담아서
		cal.calc(1, 2);
		//뺄셈이 필요할 때는 Minus를 cal에 담아서 사용
		cal = min; //또는 cal =Minus(); but! 원래 있는 객체 쓰는게 메모리 절약에 도움됨
		cal.calc(1, 2);
		
		
	}

}
