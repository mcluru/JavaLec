package chap05_class;

import java.util.Scanner;
import chap05_class.example.DistanceChanger;

public class _11_classExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		//숙제 : while문을 이용해서 무한으로 프로그램 재시작
			//Q(q)가 입력됐을때(엔터키 포함) 프로그램 종료
			//잘못 입력하면 처음부터 다시 입력하게.
		System.out.print("거리의 단위를 변환합니다. (q, Q 입력 시 종료)");
		//스캐너로 입력 값 받기
		
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
