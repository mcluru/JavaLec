package chap04_controllStatement;

import java.io.IOException;

public class _17_infiniteWhile {

	public static void main(String[] args) throws IOException {
		
		while(true) {
			System.out.print("영문자 하나를 입력하세요 : ");
			int asciiCode = System.in.read();
			
			System.in.skip(2);
			
			if((char)asciiCode == '0') {
				System.out.println("종료되었습니다.");
				break;
			}
			
			System.out.println(asciiCode >=65 && asciiCode <=90 ? "대문자입니다." : asciiCode >= 97 && asciiCode <= 122 ? "소문자입니다." : "잘못입력했습니다.");
			System.out.println(asciiCode >=65 && asciiCode <=90 ? (char)(asciiCode+32)+"로 바꾸겠습니다" : asciiCode >= 97 && asciiCode <= 122 ? (char)(asciiCode-32)+"로 바꾸겠습니다" : "");
		}
		
		
		
	}

}
