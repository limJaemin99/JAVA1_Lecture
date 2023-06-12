package day02;

import java.util.Scanner;

public class Ex3_Casting {
	public static void main(String[] args) {
		// 강제 형변환
		double num1= 97.0;
		int num2= (int)num1;	//97
		System.out.println("실수 > 정수: " + num2);
		char ch= (char)num2;	// char ch= (char)97
		System.out.println("정수 > 문자: " + ch);
		
		// 자동 형변환
		int num3= ch;	// int num3= (int)a;
		System.out.println("문자 > 정수: " + num3);
		System.out.println('A' + 10);
		
		// 아스키코드 문자 '5' > 정수 53
		System.out.println('5' + '5');	//53 + 53
		int five= '5';
		System.out.println(five);
		
		// 두 정수의 값을 입력받은 후, 나눈 결과 실수로 출력하기
		// 자동임포트: Ctrl + shift + o
		Scanner sc= new Scanner(System.in);
		
		System.out.println("첫번째 정수: ");
		int num4= sc.nextInt();
		System.out.println("두번째 정수: ");
		int num5 = sc.nextInt();
		System.out.println("결과: "+ (double)num4/num5);
		
		
		
		
		
		
		
		
	}
}
