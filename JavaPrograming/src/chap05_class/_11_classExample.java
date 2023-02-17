package chap05_class;

import java.util.Scanner;
import chap05_class.example.DistanceChanger;

public class _11_classExample {

	public static void main(String[] args) {
		//숙제 : while문을 이용해서 무한으로 프로그램 재시작
			//Q(q)가 입력됐을때(엔터키 포함) 프로그램 종료
			//잘못 입력하면 처음부터 다시 입력하게.
		
		
		while(true) {
			//스캐너로 입력 값 받기
			//scanner는 String값을 받아줌.
			//String비교는 equals메소드 사용.
			//String은 jdk에서 제공하는 기본 클래스를 사용. ==으로 비교할 시 객체의 동일성(주소값)을 비교함.
			//String의 값이 같은지 비교할 땐 equals 사용해야함.
			Scanner sc = new Scanner(System.in);
			
			System.out.print("거리의 단위를 변환합니다. (q, Q 입력 시 종료)");
			String code = sc.nextLine();
			if(code.equals("q") || code.equals("Q")) {
				break;
			}
			
			
			System.out.print("변환할 거리를 입력하시오(정수, m단위) : ");
			long distance = sc.nextLong();
			
			System.out.print("변환할 단위를 입력하시오(cm, mm, km, inch) : ");
			String unit = sc.next();
			
			//객체생성
			DistanceChanger dc = new DistanceChanger(distance, unit);
			
			//변환된 단위로 출력
			dc.change();
		
		}
		
		
	}

}
