package chap04_controllStatement;

import java.io.IOException;

public class _05_ifInIfElseIfElse {

	public static void main(String[] args) throws IOException {
		System.out.print("영문 대문자 한 개를 입력하세요 : ");
		int inputNum = System.in.read();
		
		if(inputNum >= 65 && inputNum <=90) {
			//중첩 조건문은 조건을 더 상세하게 처리하기 위해 주로 사용
			if((char)inputNum == 'Q') {
				System.out.println("종료되었습니다.");
			} else {
				System.out.println("입력된 값은 : " + (char)inputNum);
			}
		} else {
			System.out.println("잘못입력했습니다.");
		}
		
	}

}
