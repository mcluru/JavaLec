package chap05_class;

import chap05_class.example.Course;
import chap05_class.example.Student;

public class _05_defaultConstructor {

	public static void main(String[] args) {
		
		//기본생성자를 이용한 인스턴스화(객체 생성)
		Course course = new Course();
		
		System.out.println("강의 번호는 : "+ course.getcNo());
		System.out.println("강의 제목은 : "+ course.getcName());
		System.out.println("강의 학점은 : "+ course.getcScore());
		
		
		System.out.println("-----------------------");
		
		
		//다른 패키지의 클래스는 임포트된 상태에서 사용
		//임포트 단축키 : ctrl + shift + 영문자o
		//같은 객체 2개 이상 생성하면 각각 다른 heap메모리 공간에 생성됨
		//각은 객체라고 같은 메모리 공간의 하나의 객체를 사용하지x
		//기본생성자를 정의하지 않고 매개변수가 있는 생성자를 정의 -> 기존에 제공되던 기본생성자 사용불가, 따로 정의해줘야함
		//매개변수가 있는 생성자 정의할 땐 기본생성자도 함께 정의해주기.
		Student student1 = new Student();
		Student student2 = new Student();
		
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println("-----------------------");
		
		
		//기본생성자에서 속성 값을 초기화 하지 않을 경우 int는 0, String은 null로 초기화됨
		System.out.println("학번은 : " + student1.getsNo());
		System.out.println("학생 이름은 : " + student1.getsName());
		System.out.println("취득 평점은 : " + student1.getGrade());
		System.out.println("-----------------------");
		
		
		//setter 메소드를 이용한 속성 값 설정
		student1.setsNo(1);
		student1.setsName("김이젠");
		student1.setGrade("A");
		
		//속성 값 설정 후 출력
		System.out.println("학번은 : " + student1.getsNo());
		System.out.println("학생 이름은 : " + student1.getsName());
		System.out.println("취득 평점은 : " + student1.getGrade());
		System.out.println("학번은 : " + student2.getsNo());
		System.out.println("학생 이름은 : " + student2.getsName());
		System.out.println("취득 평점은 : " + student2.getGrade());
		
		
		
		
	}

}
