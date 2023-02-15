package chap04_controllStatement;

public class _11_while {

	public static void main(String[] args) {
		
		int sum = 0;
		int num = 1;
		
		while(num <=100) {
			sum += num++;
		}
		
		System.out.println("1부터 100까지 합 : " + sum);
		
	}

}
