package school;

public class ClassRoom {
	public static void main(String[] args) {
		Teacher te = new Teacher();
		// setter를 통해 값 저장하기
		te.setGender('W');	// te.gender = 'W'
		te.setClassName("연극영화과");
		te.setName("금잔디");
		te.setAge(36);
		
		// getter를 통해 값 가져오기
		te.printInfo();
		System.out.println("성별: " + te.getGender());
		System.out.println("학과: " + te.getClassName());
		System.out.println("이름: " + te.getName());
		System.out.println("나이: " + te.getAge());
		
		// [실습: Student 클래스를 통해 위의 결과와 동일하게 출력하기]
		// Student(char gender, String className, String name, int age, double grade)
		Student std1= new Student('M', "경영학과", "구준표", 24, 3.9);
		
		std1.printInfo(std1.getName());
		System.out.println("성별: " + std1.getGender());
		System.out.println("학과: " + std1.getClassName());
		System.out.println("이름: " + std1.getName());
		System.out.println("나이: " + std1.getAge());
		System.out.println("학점: " + std1.getGrade());
		
		// 객체 배열: 여러 객체들을 배열 타입으로 한번에 선언하기
		Student lee = new Student();
		Student kim = new Student();
		Student han = new Student();
		
		// 생성
//		Student[] students = new Student[3];
//		students[0] = new Student();
//		students[1] = new Student();
//		students[2] = new Student();
		
		// 생성 + 초기화
		// Student(String className, String name, int age) 
		Student[] students = {new Student("산업공학과", "이샛별", 23), new Student("전기공학과", "김기태", 20),
				new Student("국어국문학과", "홍길동", 30)};
		
		for (int i = 0; i < students.length; i++) {
			students[i].printInfo(students[i].getName());
			System.out.println("학과: " + students[i].getClassName());
			System.out.println("이름: " + students[i].getName());
			System.out.println("나이: " + students[i].getAge());
		}
		
		// 주소값 출력
		System.out.println(students[0]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
