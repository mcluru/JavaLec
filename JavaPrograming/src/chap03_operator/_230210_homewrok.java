package chap03_operator;

import java.io.IOException;

public class _230210_homewrok {

	public static void main(String[] args) throws IOException {
		char ch, chresult;
		ch = (char) System.in.read();
		System.out.print("�Է��Ͻ� ���� ");
		String strresult;
		strresult = ch<97 ? "�빮���Դϴ�." : "�ҹ����Դϴ�.";
		System.out.println(strresult);
		
		chresult = (char) (ch<97 ? ch+32 : ch-32);
		System.out.println(chresult + "�� �ٲٰڽ��ϴ�.");
		
	}

}
