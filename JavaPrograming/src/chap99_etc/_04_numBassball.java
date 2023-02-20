package chap99_etc;

import java.util.Arrays;
import java.util.Scanner;

public class _04_numBassball {

	public static void main(String[] args) {
		
		//1. 필요한 변수들 선언
		 //스트라이크와 볼의 개수를 세어줄 변수
		int strike = 0;
		int ball = 0;
		
		 //컴퓨터 랜덤 값 3개 저장할 배열(중복 불가)
		int[] com = new int[3];
		 //유저가 입력한 3개 값 저장할 배열(중복 불가)
		int[] user = new int[3];
		
		 //게임 횟수(사용자가 입력할 때마다 1씩 증가)
		int gameCnt = 0;
		
		 //입력값 받을 스캐너
		Scanner sc = new Scanner(System.in);
		
//		----------------------------------------------------
		
		
		//2. 컴퓨터가 1~9 랜덤값 3개를 com 배열에 저장(중복되면 다시 생성하도록 처리)
		 //중복처리 방식 : 0번째 인자 값은 검사 x, 1번째 인자 값부터 검사.
		 //현재 입력된 인덱스의 값과 이전에 입력된 모든 값 비교 -> 같은게 나오면 i--, 다시 for문으로 돌아가도록
		for(int i = 0; i < 3; i++) {
			com[i] = (int)(Math.random()*9)+1;
			
			boolean isComDupicated = false;
			
			if(i>0) {
				for(int j = 0; j < i; j++) {
					if(com[i] == com[j]) {
						isComDupicated = true;
						break;
					}
				}
			}
			
			if(isComDupicated) {
				//중복이 true면 해당 인덱스 랜덤 값 다시 생성
				i--;
				//다시 for문의 증감식으로 보내줌
				continue;
			}
//			if(i == 1) {
//				if(com[1] == com[0]) {
//					i--;
//					continue;
//				} 
//			} else if(i == 2) {
//				if(com[2] == com[1] || com[2] == com[0]) {
//					i--;
//					continue;
//				}
//			}
		}
		
		System.out.println(com[0]+", "+ com[1] + ", "+com[2]);
		
		
		//3. 사용자 입력 값 3개 받아서 user 배열에 저장
		 //gameCnt++ 횟수 증가
		while(true) {
			//사용자가 다시 입력하기 전에 strike와 ball 0으로 초기화
			//초기화 안하면 이전 입력된 값의 strike, ball의 값을 가지고있음
			strike = 0;
			ball = 0;
			
			for(int i = 0; i < 3; i++) {
				user[i] = sc.nextInt();
				
				boolean isUserDupicated = false;
				
				if(i>0) {
					for(int j = 0; j < i; j++) {
						if(user[i] == user[j]) {
							isUserDupicated = true;
							System.out.println("중복된 값은 허용되지 않습니다.");
							break;
						}
					}
				}
				
				if(isUserDupicated) {
					//중복이 true면 해당 인덱스 랜덤 값 다시 생성
					i--;
					//다시 for문의 증감식으로 보내줌
					continue;
				}
			}
			
			//입력횟수 증가
			gameCnt++;
			
			
			//4. 스트라이크/볼 판정
			 //중첩 for문 사용
			 //com[i] == user[j] 일 때
			 //i == j 스트라이크 판정 strike++
			 //i != j 볼 판정 ball++
			
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					if(com[i] == user[j]) {
						if(i==j) //값과 위치가 같은 경우
							strike++;
						else 
							ball++;
					}
				}
			}
			
			
			//5. 스트라이크/볼 출력
			System.out.println("com : " + Arrays.toString(com));
			System.out.println("user : " + Arrays.toString(user));
			System.out.println(strike + "스트라이크");
			System.out.println(ball + "볼");
			
			//6. 스트라이크와 볼 개수로 3스트라이크 아닐 때 다시 사용자 입력받도록
			
			if(strike < 3) {
				//while문으로 다시 보내줌
				//사용자 입력 값 다시 받기
				continue;
			} else {
				System.out.println(gameCnt + "회만에 맞추셨습니다.");
				break;
			}
		
		}
		
	}

}
