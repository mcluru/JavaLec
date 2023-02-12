package chap03_operator;

import java.io.IOException; //�대���� �쇱�대��щ━�� ���� �대���ㅻ�ㅼ�� 湲곕�μ�� �ъ�⑺��湲� ���� �대���� �몄�

public class _03_threeOpOperator {
											//�����몄�由� 諛⑹��1 - throws		//���몄�由� 諛⑹�� 2 - try/catch援щЦ �ъ��
	public static void main(String[] args) throws IOException { 
		//1. �쇳�� 議곌굔 �곗�곗��
		int result1 = 10 > 30 ? 100 : -100;
		System.out.println(result1);
		System.out.println("------------------");
		
		//2. �쇳�� 議곌굔 �곗�곗���� 以�泥�
		int result2 = 10 > 30 ? 70 > 50 ? 200 : -200 : 300;
		System.out.println(result2);
		
		int result3 = (10 > 30) ? (70 > 50 ? 200 : -200) : (90 != 80 ? 300 : -300);
		System.out.println(result3);
		
		//3. �ъ�⑹�� ���κ� 諛�湲�
		try { //援щЦ ���� 肄���瑜� �ㅽ��
			System.out.print("������ 臾몄��瑜� ���ν���몄��. : ");
			int num = System.in.read();
			System.out.println(num);
			System.out.println((char)num);
		} catch(Exception e) {
			//try 援щ��� 肄���瑜� �ㅽ�����ㅺ� ���� 諛�����硫� catch 援щЦ�� 肄���瑜� �ㅽ��
			
			System.out.println("한글");
		}
	}

}
