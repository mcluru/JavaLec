package chap05_class;

import chap05_class.example.Student;

public class _07_static {

	public static void main(String[] args) {
		
		//객체생성 없이 사용할 수 있는 static 키워드
		//static 멤버변수 사용
		System.out.println(Student.MAJOR);
		System.out.println(Student.school);
		
		//static키워드로 생성되지 않은 멤버변수는 객체생성 후 사용가능
//		System.out.println(Student.sNo);
		
		//static메소드 호출
		Student.majorInfo();
		Student.schoolInfo();
		
		//객체가 생성되지 않은 상태로 호출하여 에러발생
//		Student.sutdentInfo();
		
		
		
		
		
	}

}
