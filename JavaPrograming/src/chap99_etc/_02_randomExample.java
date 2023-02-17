package chap99_etc;

import java.util.Scanner;

public class _02_randomExample {

	public static void main(String[] args) {
		
		//컴퓨터는 1~3까지의 랜덤 생성
		int randomVal = (int)(Math.random()*3)+1;
		
		//사용자가 1~3까지 입력
		System.out.print("1~3 중에 입력하세요. : ");
		Scanner sc = new Scanner(System.in);
		int userNum = sc.nextInt();
		
		//사용자 입력값이 컴퓨터가 생성한 랜덤값과 같으면 "맞췄습니다"
		//	아니면 "틀렸습니다" 출력
		if(randomVal == userNum) {
			System.out.println("컴퓨터의 값 : " + randomVal);
			System.out.println("사용자의 값 : " + userNum);
			System.out.println("맞췄습니다");
		}
		else {
			System.out.println("컴퓨터의 값 : " + randomVal);
			System.out.println("사용자의 값 : " + userNum);
			System.out.println("틀렸습니다");
		}
		
		
	}

}
