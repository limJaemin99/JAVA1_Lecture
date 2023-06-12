package day02;

public class Ex1_VariableTask {
	public static void main(String[] args) {
		// ❤❤❤❤홍길동 님의 정보❤❤❤❤
		// 이름: 홍길동
		// 나이: 10살
		// 키: 180.24cm
		// 몸무게: 70.11kg
		// 성적: A
		
		//1. 데이터들은 변수에 담아서 선언. 변수를 사용 해서 위의 폼대로 출력
		String name= "홍길동";
		int age= 10;
		double height= 180.24;
		float weight= 70.1143f;
		char score = 'A';
		
		//2. printf()로 바꿔서 출력하기
		System.out.println("❤❤❤❤" + name + "님의 정보❤❤❤❤");
//		System.out.println("이름: " + name);
		System.out.printf("이름: %s \n",name);
//		System.out.println("나이: " + age + "살");
		System.out.printf("나이: %d 살\n",age);
		
		// 소수점 밑으로 1자리 까지 출력
//		System.out.println("키: " + height +"cm");
		System.out.printf("키: %.1f cm\n", height);
		
		// 소수점 밑으로 3자리까지 출력
//		System.out.println("몸무게: " + weight+ "kg");
		System.out.printf("몸무게: %.3f kg\n", weight);
		
//		System.out.println("성적: " + score);
		System.out.printf("성적: %c", score);
		
		String a= "ABC";
		String b= "안녕";
		String c= "Hello";
		
		System.out.printf("%s %s %s %s %d %d...", a, b, c);	
	}
}
