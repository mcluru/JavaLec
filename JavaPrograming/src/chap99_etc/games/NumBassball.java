package chap99_etc.games;

import java.util.Arrays;
import java.util.Scanner;

public class NumBassball extends GamesClass {

	 //스트라이크와 볼의 개수를 세어줄 변수
	private int strike = 0;
	private int ball = 0;
	
	 //컴퓨터 랜덤 값 3개 저장할 배열(중복 불가)
	private int[] com = new int[3];
	 //유저가 입력한 3개 값 저장할 배열(중복 불가)
	private int[] user = new int[3];
	
	 //게임 횟수(사용자가 입력할 때마다 1씩 증가)
	private int gameCnt = 0;
	
	 //입력값 받을 스캐너
	private Scanner sc = new Scanner(System.in);

//	-----------------------------------------멤버변수
	
	
	//게임을 시작하는 메소드
	public void start() {
		//com배열에 랜덤 값 3개 생성
		generateRandom();
		
		while(true) {
			//사용자가 다시 입력하기 전에 strike와 ball 0으로 초기화
			//초기화 안하면 이전 입력된 값의 strike, ball의 값을 가지고있음
			strike = 0;
			ball = 0;
			
			//사용자 입력 3번 받아서 user배열에 담음
			getUserInput();
			
			//strike가 3이상이면 true 리턴 ->if문의 메소드가 true일땐 무조건 strike가 3이상 ->게임 종료
			if(judgeStrike()) {
				break;
			} else {
				continue;
			}
		
		}
	}
	
	
//	-----------------------------------------------메소드
	
	//랜덤값 3개 생성해서 com배열에 담아주는 메소드(중복체크)
	//전역변수인 com배열에 값을 담아주므로 리턴 값이 없는 void
	//generateRandom
	public void generateRandom() {
		for(int i = 0; i < com.length; i++) {
			com[i] = (int)(Math.random()*9)+1;
			
			//중복체크
			//checkDuplicate(i)메소드의 결과가 true일때
			if(i>0) {
				if(checkDuplicate(com, i)) {
					//중복일 경우
					i--;
					continue;
				}
			}
		}
		System.out.println("com : " + Arrays.toString(com));
	}
	
	//사용자 입력값 받아서 user배열에 담는 메소드(중복체크)
	//전역변수인 user배열에 값을 담아주므로 리턴 값이 없는 void
	//getUserInput
	public void getUserInput() {
		for(int i = 0; i < user.length; i++) {
			System.out.println("1~9까지의 정수 하나 입력 : ");
			user[i] = sc.nextInt();
			
			//중복체크
			if(i>0) {
				if(checkDuplicate(user, i)) {
					System.out.println("중복된 값은 허용되지 않습니다.");
					i--;
					continue;
				}
			}
		}
		
		//중복값 없는 온전한 user배열 완성
		gameCnt++;
	}
	
	
	//중복체크(리턴값 boolean으로 true/false)
	//checkDuplicate
	//arr은 com배열이나 user배열을 받아줄 매개변수
	public boolean checkDuplicate(int[] arr, int i) {
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					return true;
				}
			}
		//중복이 안된 경우
		//for문안의 if문을 타지 않으면 결국 for문 밖까지 나오게 됨
		return false;
	}
	
	//스트라이크/볼판정 + 스트라이크/볼 출력 + 스트라이크 개수로 계속 입력인지 게임종료인지 판단하는 메소드(리턴값 boolean으로 true/false)
	//strike < 3 -> false
	//else -> true
	//judgeStrike
	public boolean judgeStrike() {
		//스트라이크/볼 판정
		for(int i = 0; i < com.length; i++) {
			for(int j = 0; j < user.length; j++) {
				if(com[i] == user[j]) {
					if(i==j) //값과 위치가 같은 경우
						strike++;
					else 
						ball++;
				}
			}
		}
		//스트라이크/볼 출력
		System.out.println("com : " + Arrays.toString(com));
		System.out.println("user : " + Arrays.toString(user));
		System.out.println(strike + "스트라이크");
		System.out.println(ball + "볼");
		
		if(strike < 3) {
			return false;
		}
		else {
			System.out.println(gameCnt + "회만에 맞추셨습니다.");
			return true;
		}
		
	}
	
	
	
	
}
