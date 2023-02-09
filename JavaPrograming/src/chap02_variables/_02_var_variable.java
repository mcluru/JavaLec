package chap02_variables;

public class _02_var_variable {

	public static void main(String[] args) {
		var str1 = "JOJO";
		
		System.out.println(str1);
		System.out.println(str1.getClass().getName());
		System.out.println("--------------");
		
		//변수명.getClass().getName()은 변수의 클래스 확인(원시타입은 사용 불가)
		//원시타입은 wrapper 클래스로 변환 후 위처럼 클래스 확인 가능(원시타입엔 각각 wrapper 클래스가 존재함)
		//int → Integer, long → Long, byte → Byte …
		//wrapper 클래스로 변환 방법 : (Object)변수명
		
		
		var num1 = 100;
		
		System.out.println(num1);
		System.out.println(((Object)num1).getClass().getName());
		System.out.println("--------------");
		
		
		
		var num2 = 12.25;
		
		System.out.println(num2);
		System.out.println(((Object)num2).getClass().getName());
		System.out.println("--------------");
		
		
		
	}

}
