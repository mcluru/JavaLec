package chap03_operator;

public class _02_twoOpOperator {

	public static void main(String[] args) {
		//1. 대입연산자
		//왼쪽 항의 변수에 오른쪽 항의 값을 대입
		int a = 10;
		int b = 6;
		
		
		//2. 산술연산자
		int num1 = 30;
		int num2 = 7;
		int result;
		
		result = num1+num2;
		System.out.println("num1 + num2 = " + result); //37
		
		result = num1-num2;
		System.out.println("num1 - num2 = " + result); //23
		
		result = num1*num2;
		System.out.println("num1 * num2 = " + result); //210
		
		result = num1/num2;
		System.out.println("num1 / num2 = " + result); //4
		
		result = num1%num2;
		System.out.println("num1 % num2 = " + result); //2
		System.out.println("---------------");
		
		
		//3. 복합 대입 연산자
		int num3 = 10;
		int num4 = 3;
		
		num3 += num4;
		System.out.println("num3 += num4 = " + num3); //num3 = 13
		
		num3 -= num4;
		System.out.println("num3 -= num4 = " + num3); //num3 = 10
		
		num3 *= num4;
		System.out.println("num3 *= num4 = " + num3); //num3 = 30
		
		num3 /= num4;
		System.out.println("num3 /= num4 = " + num3); //num3 = 10
		
		num3 %= num4;
		System.out.println("num3 %= num4 = " + num3); //num3 = 1
		System.out.println("---------------");
		
		
		//4. 관계연산자
		int num5 = 100;
		int num6 = 300;
		boolean result2;
		
		result2 = num5 < num6;
		System.out.println("num5 < num6 = " + result2);
		
		result2 = num5 > num6;
		System.out.println("num5 > num6 = " + result2);
		
		result2 = num5 <= num6;
		System.out.println("num5 <= num6 = " + result2);
		
		result2 = num5 >= num6;
		System.out.println("num5 >= num6 = " + result2);
		
		result2 = num5 == num6;
		System.out.println("num5 == num6 = " + result2);
		
		result2 = num5 != num6;
		System.out.println("num5 != num6 = " + result2);
		System.out.println("---------------");
		
		
		//4. 논리연산자
		boolean result3;
		
		result3 = 43 >= 81 && 62 < 99;
		System.out.println("43 >= 81 && 62 < 99 = " + result3);
		
		result3 = false || num5 == (num6/3);
		System.out.println("false || num5 == (num6/3) = " + result3);
		
		System.out.println("!result3 = " + !result3);
		
		
		
		
		
	}

}
