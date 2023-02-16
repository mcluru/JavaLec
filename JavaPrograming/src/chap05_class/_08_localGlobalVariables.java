package chap05_class;

import chap05_class.example.Operation;

public class _08_localGlobalVariables {
	
	public static void main(String[] args) {
		
		Operation op = new Operation();
	
		//지역변수 result2는 add메소드가 종료되면 사라지기 때문에, 기존에 연산됐던 값도 함께 삭제됨.
		System.out.println(op.add(1,2));
		System.out.println(op.add(3,4));
		
		//전역변수로 선어된 result1이 객체가 삭제되기 전까지 존재하기 때문에, 바뀐 값을 계속 기억하고 있음.
		System.out.println(op.add(3));
		System.out.println(op.add(4));
		
		
		
		
		
	}
	
}
