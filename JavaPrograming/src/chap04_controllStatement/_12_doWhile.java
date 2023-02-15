package chap04_controllStatement;

public class _12_doWhile {

	public static void main(String[] args) {
		
		int sum = 0;
		int num = 1;
		
		do {
			sum += num;
			System.out.println(num++ + "회 실행");
		}while(num > 100);
		
		
		
		int cnt = 1;
		
		do {
			System.out.println("Java Study" + cnt++);
		}while(cnt <= 10);
		
	}

}
