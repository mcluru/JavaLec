package chap99_etc.games;

import java.util.Scanner;

public class RockScissPaper extends GamesClass {
	//가위, 바위, 보게임 객체를 생성하여 게임을 진행할 수 있도록 리팩토링
	
	//몇승 몇무 몇패인지 셀 변수
	int win = 0;
	int draw = 0;
	int lose = 0;
	
	//승점 담아줄 변수(승:1, 무:0, 패:-1)
	int score = 0;
	
	//승무패 기록을 담아줄 배열
	int[] wdl = new int[10];
//	---------------------------------멤버변수
	
		
	//게임을 실행하는 메소드
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		
		//사용자가 입력한 round 만큼 게임진행
		System.out.println("진행할 게임의 판 수를 입력하시오");
		int round = sc.nextInt();
		wdl = new int[round];
		
	
			
		//총 10판 진행
		for(int i = 0; i<wdl.length; i++) {
			//클래스 안에 랜덤 변수를 발생시키는 메소드 
			//1~3까지 랜덤 변수 (1:가위. 2:바위, 3:보)
			int randomVal = generateRandom();
			
			//사용자 입력 값 받아서 정수형 변환해주는 메소드
			int userNum = convertUserInput(sc);
			
			if(userNum == 0) {
				System.out.println("잘못 입력하셨습니다.");
				//해당 게임을 다시 진행하기 위해 1 감소
				//for문에서 continue문을 만나면 증감식으로 이동하기 때문
				i--;
				continue;
			}
		
		
			//승, 무, 패 판단해주는 메소드
			//가위, 바위, 보 비교
			judgeWdl(userNum, randomVal, i);
	
	
		}
		//승점 계산해주는 메소드
		//승점 계산
		sumScore();
	}
	
	
	
	
	//1~3중 랜덤 값 발생시키는 메소드
	public int generateRandom() {
		return (int)(Math.random()*3)+1;
	}
	
	//사용자 입력 값을 정수형으로 변환해주는 메소드
	public int convertUserInput(Scanner sc) {
		System.out.print("가위, 바위, 보 중 하나를 입력하세요. : ");
		String userNumStr = sc.nextLine();
		
		if(userNumStr.equals("가위")) {
			return 1;
		} else if(userNumStr.equals("바위")) {
			return 2;
		} else if(userNumStr.equals("보")) {
			return 3;
		} else {
			return 0;
		}
	}
	
	
	//승, 무, 패 판단 메소드
	public void judgeWdl(int userNum, int randomVal, int i) {
		if(userNum == randomVal) {
			System.out.println("비겼습니다.");
			draw++;
			wdl[i] = 0;
		} else {
			//승리와 패배 조건 나누기
			//승리
			if((userNum == 1 && randomVal == 3) ||
				(userNum == 2 && randomVal == 1) ||
				(userNum == 3 && randomVal == 2)) {
				System.out.println("이겼습니다.");
				win++;
				wdl[i] = 1;
			} else {
				System.out.println("졌습니다.");
				lose++;
				wdl[i] = -1;
			}
		}
	}
		
	//승점 계산 및 출력 메소드
	public void sumScore() {
		for(int j = 0; j < wdl.length; j++) {
			score += wdl[j];
		}
		
		System.out.println("전적은 " + win + "승 " + draw + "무 " 
				+ lose + "패. 총 승점 : " + score);
		
		System.out.println("----------------------------------");
	}
		
		
		
		
		
}
