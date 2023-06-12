package day03;

public class Ex5_ForTest {
	public static void main(String[] args) {
		//증감연산자
		int num= 10;
		System.out.println("전위형: " + ++num);	// 먼저 증가 후 참조
		num = 10;	// 다시 10으로 초기화
		System.out.println("후위형: " + num++);	// 먼저 참조 후 증가
		System.out.println(num);
		
		// for문
		// 안녕 10번 출력하기
		for(int i= 0; i<10; i++) {	// i는 0~9	> 10번 반복
			// 컴퓨터는 0부터 숫자를 세기 때문에 되도록이면 초기값은 0부터 시작
			System.out.println("안녕");
		}
		
		// 초기식 > 증감식 > 조건식 순서로 for문 만들기
		// 10~1출력(10 9 8 7 6 5 4 3 2 1)
		for(int i= 10; i > 0; i--) {
//			System.out.println(i);
		}
		
		// 조건식이 false일 경우 for문 실행 x
		for(int i= 10; i < 0; i--) {
			System.out.println(i);
		}
		
		// 0부터 시작해서 2씩 증가하며 10번 반복
		for(int i=0; i < 20; i+=2) {	// i = i+2
			System.out.println(i);
		}

		// 변수의 범위는 자신이 선언된 위치부터 선언된 블럭의 끝까지
		// for문에 선언된 i는 for문 내부에서만 사용가능하다.
		
	}
}
