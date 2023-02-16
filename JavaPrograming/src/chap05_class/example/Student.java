package chap05_class.example;

public class Student {
	public static String school = "ezen";
	public static final String MAJOR = "ComputerEngineering";
	private int sNo; //학번
	private String sName; //학생이름
	private String grade; //취득 평점
	//다른 객체를 속성(멤버변수)로 선언할 수 있다.
	//하나의 클래스에서 다른 클래스를 참조하여 사용할 때, 이것을 의존성이라고 표현.
	//Course의 내용이 변경되거나 속성이 바뀌면 Student도 변경됨. 이 때 Student가 Course에 의존되므로, 의존성이라 부름.
	//좋은프로그래밍 : 결합도 높고 의존도 낮아야함.
	//의존도 낮추는 방법 : 클래스간의 참조관계를 적게 사용하는것.
	private Course course; //수강과목
	
	//기본생성자 정의 안함
	
	public Student() {}//기본생성자 in undefined 에러방지를 위해 기본생성자 정의
	public Student(int sNo) {  //매개변수 있는 생성자(기본생성자가 없는 상태)
		this.sNo = sNo;
	}
	
	public Student(int sNo, String sName) {
		this(sNo);
		this.sName = sName;
	}
	
	public Student(int sNo, String sName, String grade) {
		this(sNo, sName);  //<<이렇게 해두고 어떻게 사용해야하지?
		this.course = new Course(1, "java", 4);
		this.grade = grade;
	}
	
	
	
	
	public int getsNo() {
		return sNo;
	}
	public void setsNo(int sNo) {
		this.sNo = sNo;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	
	public static void schoolInfo() {
		System.out.println(school);
	}
	
	public static void majorInfo() {
		System.out.println(MAJOR);
	}
	
	public void studentInfo() {
		System.out.println(sNo + " " + sName);
	}
	
}
