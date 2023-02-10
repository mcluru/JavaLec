package chap02_variables;

public class _04_autoTypeChange {

	public static void main(String[] args) {
		//1. 바이트가 작은 단위 → 큰단위로 자동 형변환
		
		byte byteVal = 10;
		char chVal = 'A';
		int intVal = byteVal;
		
		System.out.println(intVal);
		System.out.println("------------------");
		
		intVal = chVal;
		System.out.println(intVal);
		System.out.println("------------------");
		
		//2. 더 세밀하고 표현범위가 넓은 자료형으로 자동 형변환
		
		long longVal = 100000L;
		float floatVal = longVal;
		
		System.out.println(floatVal);
		System.out.println("------------------");
		
		floatVal = intVal;
		System.out.println(floatVal);
		System.out.println("------------------");
		
		
		System.out.println(((Object)byteVal).getClass().getName());
		System.out.println(((Object)chVal).getClass().getName());
		System.out.println(((Object)intVal).getClass().getName());
		System.out.println(((Object)longVal).getClass().getName());
		System.out.println(((Object)floatVal).getClass().getName());
		
		
		
		
		
	}

}
