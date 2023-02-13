package chap04_controllStatement;

import java.io.IOException;

public class _10_forQuestion {

	public static void main(String[] args) throws IOException {
		
		//1.영문자 하나 입력받기
		System.out.print("영문자를 한 개 입력하세요 : ");
		int asciiCode = System.in.read();
		
		
		//2.영문자가 대문자인지 소문자인지, 아니면 영문자가 아닌지
		//if/else if/else로 판별
		//for문으로 입력한 영문자부터 대문자면 대문자 Z까지 출력, 소문자면 소문자 z까지 출력
		//if가 대문자일 때 소문자
		//if가 소문자일 때 대문자
		//입력되는 영문자에 따라 i의 초기값이 계속 변경되도록 설정
		if(65 <= asciiCode && asciiCode <= 90) {
			for(int i = asciiCode ; i <= 90 ; i++) {
				System.out.print((char)i);
			}
			System.out.println();
			System.out.println((char)(asciiCode+32));
		} else if(97 <= asciiCode && asciiCode <= 122) {
			for(int i = asciiCode ; i <= 122 ; i++) {
				System.out.print((char)i);
			}
			System.out.println();
			System.out.println((char)(asciiCode-32));
		} else {
			System.out.println("잘못 입력하셨습니다");
		}
			//잘못 입력하셨습니다. 출력
	}

}
