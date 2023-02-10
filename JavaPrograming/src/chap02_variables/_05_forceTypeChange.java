package chap02_variables;

public class _05_forceTypeChange {

	public static void main(String[] args) {
		//1. 큰 단위의 값을 작은 단위의 값으로 대입할 때
		long longVal = 300000L;
		int intVal = (int)longVal;
		
		System.out.println(intVal);
		System.out.println("----------------------");
		
		short shortVal = (short)longVal;
		
		//300000이 short 범위를 넘어서 -27680이 표출됨
		//자료형의 범위를 값이 대입되면 비트단위 연산으로 변경
		//short 2진수로 표현 -> 16자리 0000 0000 0000 0000
		//음수 표현가능 자료형은 2진수의 제일 큰 자리수(첫자리)가 부호를 결정. 1=음수. 0=양수
		//32767 -> 0111 1111 1111 1111
		//-32768 -> 1000 0000 0000 0000 (부호 반전)
		//32770 -> 1000 0000 0000 010 -> 1111 1111 1111 1101 -> -32766
		//300000 - 32768에서 2진수값에 1씩 더해짐
		//몇 번의 부호 반전 발생 후 -27680라는 값 출력
		System.out.println(shortVal);
		System.out.println("----------------------");
		
		//2. 더 세밀한 자료형의 값을 덜 세밀한 자료형에 대입할 때
		float floatVal = 3.14f;
		intVal = (int)floatVal;
		
		System.out.println(intVal);
		System.out.println("----------------------");
		
		longVal = (long)floatVal;
		System.out.println(longVal);
		System.out.println("----------------------");
	}

}
