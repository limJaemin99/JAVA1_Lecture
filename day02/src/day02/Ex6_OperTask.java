package day02;

import java.util.Scanner;

public class Ex6_OperTask {
	public static void main(String[] args) {
		// 정수를 하나 입력받은 후, 1이라면 사용자에게 '문자열을 입력' 받고 해당 문자열 출력하기
		// 만약 1이 아니라면 사용자에게 '정수를 입력' 받고 해당 정수 출력하기
		Scanner sc= new Scanner(System.in);
		
		System.out.println("1 또는 그 외의 정수를 입력하세요");
		int number= sc.nextInt();
		System.out.println(number == 1? "문자열: " : "정수: ");
		System.out.println(number == 1? sc.next() : sc.nextInt());
	}
}
