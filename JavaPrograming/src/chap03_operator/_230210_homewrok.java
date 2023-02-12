package chap03_operator;

import java.io.IOException;

public class _230210_homewrok {

	public static void main(String[] args) throws IOException {
		char ch, chresult;
		ch = (char) System.in.read();
		System.out.print("입력하신 값은 ");
		String strresult;
		strresult = ch<97 ? "대문자입니다." : "소문자입니다.";
		System.out.println(strresult);
		
		chresult = (char) (ch<97 ? ch+32 : ch-32);
		System.out.println(chresult + "로 바꾸겠습니다.");
		
	}

}
