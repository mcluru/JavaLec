package chap04_controllStatement;

public class _15_break {

	public static void main(String[] args) {
		
		for(int i = 0; i<10; i++) {
			if(i==6) {
				//break문을 만나서 for문 종료
				break;
			}
			System.out.println(i);
		}
		System.out.println("-------------------");
		
		
		int num = -1;
		while(++num < 10) {
			if(num == 6) {
				//break문을 만나서 while문 종료
				break;
			}
			System.out.println(num);
		}
		System.out.println("-------------------");
		
		
		
		//구구단 중 5단까지만 출력, 4단을 제외
		
		for(int i = 2; i <=9; i++) {
			if(i>5) {
				break;
			}
			if(i == 4) {
				continue;
			}
			for(int j = 1; j <=9; j++) {
				System.out.print(i + "*" + j + "=" + i*j+"   ");
			}
			System.out.println();
		}
		System.out.println("-------------------");
		
		
		//중첩 for문에서 break/continue를 사용할 경우
		//원하는 반복문의 블록을 잘 파악해서 사용하기.
		for(int i = 2; i <=9; i++) {
			System.out.println(i);
			for(int j = 1; j <=9; j++) {
				if(i>6) {
					break;
				}
				System.out.print(i + "*" + j + "=" + i*j+"   ");
			}
			System.out.println();
		}
		System.out.println("-------------------");
		
		
		
		
		
		
		
	}

}
