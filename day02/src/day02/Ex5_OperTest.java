package day02;

import java.util.Scanner;

public class Ex5_OperTest {
	public static void main(String[] args) {
		int num= 10;
		// 조건식 ? 값1 : 값2
		String result = num == 0 ? "123" : "456";
		// 변수에 담을 경우 true일 때와 false일떄의 값의 '자료형'을 일치 시키기!
		System.out.println(result);
		
		// 변수에 담지 않은 경우엔 true일때와 false일때의 값의 자료형 불일치 ok
		System.out.println(num==1? 666: "abc");
		
		// 정수를 입력받은 후, 양수일 경우 "양수입니다" 출력/ 음수일 경우 "음수입니다" 출력
		Scanner sc= new Scanner(System.in);
		System.out.println("정수 입력: ");
		int number= sc.nextInt();
		String rst= number > 0? "양수입니다" : number < 0? "음수입니다." : "0 입니다.";
		System.out.println(rst);
		
		
	}
}
