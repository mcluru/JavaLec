package chap05_class;

public class _03_method {
	static int sum;
	static long multi;
	static double divid;
	
	public static void main(String[] args) {
		
		//반환타입이 있는 경우 해당 타입의 변수로 값을 받아도 됨.
		//메소드의 결과값(return값)이 해당변수에 저장됨
		int addResult = add(1,2);
		//반환타입과 다른 타입의 변수로 받을 경우 에러.
		//강제 형변환을 통해 변수의 타입과 맞추면 다른 타입의 변수로도 받을 수 있음
		char aaa = (char)add(1, 2); 
		System.out.println("1 + 2 = "+addResult);
		
		//반환타입이 있기 때문에 바로 출력도 가능
		System.out.println("3 + 4 = "+add(3,4));
		
		//void형태는 반환타입이 없기 때문에, 메소드 내에서 미리 선언해둔 전역변수/static 변수에 결과 값을 담아야함.
		add(5, 6, 7); //void 형태이기 때문에 다른 변수에 담지 않음
		System.out.println("5 + 6 + 7 = " + sum);
		System.out.println("-------------------------");
		
		
		int minusResult = minus(3,1);
		System.out.println("3 - 1 = " + minusResult);
		System.out.println("4 - 2 = " + minus(4, 2));
		
		minus(10, 2, 6);
		System.out.println("10 - 2 - 6 = " + sum);
		
		long multipleResult = multiple(5, 4);
		System.out.println("5 * 4 = " + multipleResult);
		System.out.println("128 * 22 = " + multiple(128, 22));
		
		multiple(11, 12, 14);
		System.out.println("11 * 12 * 14 = " + multi);
		
		double dividResult = divide(56, 11);
		System.out.println("56 / 11 = " + dividResult);
		System.out.println("225 / 13 = " + divide(225, 13));
		
		divide(300, 3, 10);
		System.out.println("300 / 3 / 10 = " + divid);
		
		
	}
	
	//메소드 지정
	//같은 클래스에서 사용할 메소드는 static 선언
	//반환타입이 int여서 return int형태로 지정
	public static int add(int a, int b) {
		return a+b;
	}
	
	//오버로딩된 메소드(메소드 이름은 같지만 매개변수의 타입이나 개수가 다름)
	//void는 반환 값이 없는 타입. 따라서 return문 필요x
	public static void add(int a, int b, int c) {
		sum = a+b+c;
	}
	
	
	
	
	//곱하기 메소드 만들기(메소드명 : multiple, 반환타입 : long(매개변수 2개), void(매개변수 3개))
	public static long multiple(long a , long b) {
		return a*b;
	}
	
	public static void multiple(long a, long b, long c) {
		multi = a*b*c;
	}
	
	
	//빼기, 나누기(minus(int, void), divide(double,void))
	public static int minus(int a, int b) {
		return a-b;
	}
	
	public static void minus(int a, int b, int c) {
		sum = a-b-c;
	}
	
	public static double divide(int a, int b) {
		return (double)a/b;
	}
	
	public static void divide(int a, int b, int c) {
		divid = (double)a/b/c;
	}
	
	

}
