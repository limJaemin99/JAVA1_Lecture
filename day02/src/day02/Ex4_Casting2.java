package day02;

import java.util.Scanner;

public class Ex4_Casting2 {
	public static void main(String[] args) {
		// 자동임포트: Ctrl + shift + o
		Scanner sc= new Scanner(System.in);
		
		// 두 정수를 문자열로 입력 받은 후 더한 결과 정수로 출력
		System.out.println("첫번째 정수: ");
		String num1 = sc.next();
		System.out.println("두번째 정수: ");
		String num2= sc.next();
		
		// 문자열 > 기본형 바꿀 때는 형변환 연산자 사용x
//		System.out.println(num1 + num2);
//		int result= (int)num1 + (int)num2;	// 오류
		
		// 형변환 연산자는 기본형들끼리 가능 / 클래스는 클래스들끼리 형변환
		// 문자열 > 정수 형변환
		int result= Integer.parseInt(num1) + Integer.parseInt(num2);
		System.out.println("결과: " + result);
		
		// 문자열 > 실수 형변환
		double rst = Double.parseDouble(num1) + Double.parseDouble(num2);
		System.out.println("실수타입 결과: " + rst);
		
		// 문자열 > 문자 형변환
		System.out.println("문자열을 입력하세요");
		char ch= sc.next().charAt(0);	// "안녕하세요"
		System.out.println("문자열 > 문자: " + ch);
		
		System.out.println("Hello".charAt(4));
	
	}
}
