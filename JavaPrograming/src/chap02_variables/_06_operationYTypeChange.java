package chap02_variables;

public class _06_operationYTypeChange {

	public static void main(String[] args) {
		//1. 바이트가 큰 자료형과 바이트가 작은 자료형의 연산
		long longVal = 10000L;
		int intVal = 200;
		
		//intVal이 자동으로 long으로 형변환 후 연산됨
		long result = longVal + intVal;
		
		System.out.println(result);
		System.out.println("------------------");
		
		//2. 바이트가 작은 자료형으로 형변환 후 연산하고 싶을 때는 명시적 형변환 사용
		int intResult = (int)longVal + intVal;
		
		System.out.println(intResult);
		System.out.println("------------------");
		
		System.out.println(((Object)(longVal+intVal)).getClass().getName());
		System.out.println(((Object)((int)longVal+intVal)).getClass().getName());
		
		
		//3. 문자열 결합연산자에서의 형변환
		String strVal = "JOJO";
		
		//int형인 intVal이 문자열(String)으로 형변환 후 문자열 결합 연산.
		System.out.println(strVal + intVal);
		System.out.println((strVal + intVal).getClass().getName());
		
	}

}
