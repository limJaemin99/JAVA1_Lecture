package school;

// [실습: Student 필드 만들기]
/* 학과(className), 이름(name), 나이(age), 학점(grade)
 * 주어진 메소드 내에서 자유롭게 오버라이딩 / 오버로딩 하기
 * 필요하다면 생성자 만들기
 * ※ 부모는 Human 클래스로 설정
 * ※ 변수의 접근제어자는 private로 제한한다.
*/
public class Student extends Human{
	private String className;
	private String name;
	private int age;
	private double grade;
	
	public Student(){}
	
	// 생성자 초기화: alt + shift + s > o
	public Student(char gender, String className, String name, int age, double grade) {
		super(gender);	// Human(char gender)
		this.className = className;
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	// 학과, 이름, 나이만 초기화 시키는 생성자
	public Student(String className, String name, int age) {
		this.className = className;
		this.name = name;
		this.age = age;
	}

	// 오버라이딩
	@Override
	public void printInfo() {
		System.out.println("===== 학생의 정보 =====");
	}
	

	// 오버로딩
	public void printInfo(String name) {
		System.out.println("=========" + name + "의 정보=========");
	}


	public String getClassName() {
		return className;
	}


	public void setClassName(String className) {
		this.className = className;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getGrade() {
		return grade;
	}


	public void setGrade(double grade) {
		this.grade = grade;
	}
	
}
