package chap99_etc.games;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto extends GamesClass {

	Scanner sc = new Scanner(System.in);
	
	//배열 담을 변수들
	int[] com = new int[7];
	int[] user = new int[6];
	
	int count = 0;
	
	//보너스 번호 맞앗는지 확인하는 변수
	//맞으면 true로 변경
	boolean bonus = false;
	
	//중복체크에서 사용할 변수
	boolean isDuplicated = false;
	
//	----------------------------------------------------------변수
	
	//게임 시작 메소드
	@Override
	public void start() {
		System.out.println("로또게임을 시작합니다.");
		generateRandom();
		
		getUserInput();
		
		compareNum();
		
		printResult();
	}
	
	
//	---------------------------------------------------------메소드
	
	//컴퓨터 랜덤값 생성 메소드+로또출력
	public void generateRandom() {
		for(int i = 0; i<com.length; i++) {
			com[i] = (int)(Math.random()*45)+1;
			
			if(i>0) {
				if(isDuplicate(com, i)) {
					isDuplicated = false;
					i--;
					continue;
				}
			}
		}
		
		System.out.print("이번주 로또번호는 ");
		for(int i = 0; i<com.length; i++) {
			if(i==6) {
				System.out.println("보너스 번호 : " + com[i]);
			} else {
				System.out.print(com[i] + ", ");
			}
		}
	}
	
	
	
//	------------------------------------
	//유저값
	public void getUserInput() {
		for(int i = 0; i < user.length; i++) {
			user[i] = sc.nextInt();
			if(user[i] > 45 || user[i] < 1) {
				System.out.println("잘못 입력하셨습니다");
				i--;
				continue;
			}
			
			
			if(i>0) {
				if(isDuplicate(com, i)) {
					System.out.println("중복된 값은 허용되지 않습니다.");
					isDuplicated = false;
					i--;
					continue;
				}
			}
			
		}
		
		System.out.println("입력하신 값 : " + Arrays.toString(user));
	}

//	------------------------------------
	
	//중복체크 메소드
	public boolean isDuplicate(int[] arr, int i) {
		for(int j = 0; j < i; j++) {
			if(arr[i] == arr[j]) {
				return true;
			} 
		} return false;
	}	
	
	
//	------------------------------------		
	//배열비교
	//6개 다 맞을 경우 1등
	//5개+보너스 2등
	//5개 3등, 4개 4등, 3개 5등, 나머지 꽝
	public void compareNum() {
		for(int i = 0; i<com.length ; i++) {
			for(int j = 0; j<user.length; j++) {
				if(com[i] == user[j]) {
					if(i==6) {
						bonus = true;
					} else {
						count++;
					}
				}
			}
		}
	}
	
	
//	------------------------------------	
	
	//결과 출력 메소드
	public void printResult() {
		System.out.println(count + "개 맞췄습니다.");
		switch (count) {
			case 6 : 
				System.out.println("1등");
				break;
			case 5 : 
				if(bonus) {
					System.out.println("2등");
					break;
				}
				System.out.println("3등");
				break;
			case 4 :
				System.out.println("4등");
				break;
			case 3 :
				System.out.println("5등");
				break;
			default :
				System.out.println("꽝");
				break;
		}
	}
	
	
	
	
	
}
