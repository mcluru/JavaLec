package chap04_controllStatement;

import java.util.Scanner;

public class _09_forQuestion {

	public static void main(String[] args) {
		
		//1.사용자 입력 값 받기
		//System.in.read()는 입력된 값은 아스키코드로 변환하여 저장
		//입력한 값을 그대로 받아주려면 Scanner 클래스 사용
		System.out.print("정수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		//2.for문으로 1~사용자가 입력한 정수까지의 합
		int sum = 0;
		for(int i = 1 ; i <= num ; i++) {
			sum += i;
		}
		System.out.println("1~"+num+"까지의 합 : "+sum);
		
	}

}
