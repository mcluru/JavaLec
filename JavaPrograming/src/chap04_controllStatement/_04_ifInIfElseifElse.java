package chap04_controllStatement;

public class _04_ifInIfElseifElse {

	public static void main(String[] args) {
		
		int score = 79;
		//95점 이상 A+
		//95점 미만 A0
		if(score >= 90) {
			if(score >= 95)
				System.out.println("A+");
			else
				System.out.println("A0");
		}
		//85점 이상 B+
		//85점 미만 B0
		else if(score >= 80) {
			if(score >= 85)
				System.out.println("B+");
			else
				System.out.println("B0");
		}
		//75점 이상 C+
		//75점 미만 C0
		else if(score >= 70) {
			if(score >= 75)
				System.out.println("C+");
			else
				System.out.println("C0");
		}
		//65점 이상 D+
		//65점 미만 D0
		else {
			if(score >= 65)
				System.out.println("D+");
			else
				System.out.println("D0");
		}
		
	}

}
