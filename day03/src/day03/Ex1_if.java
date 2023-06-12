package day03;

import java.util.Scanner;

public class Ex1_if {
	public static void main(String[] args) {
		// 정수를 입력받은 후, 양수일 경우 "양수입니다" 출력/ 음수일 경우 "음수입니다" 출력
		Scanner sc= new Scanner(System.in);
		System.out.println("정수입력: ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수입니다.");
		}else if(num < 0) {
			System.out.println("음수입니다.");
		}else {
			System.out.println("0 입니다.");
		}
		
		// 일괄처리
		String result= "";
		int number= 0;
		
		if(num > 0) {
			result= "양수입니다.";
		}else if(num < 0) {
			result= "음수입니다.";
		}else {
			result= "0 입니다.";
		}
		System.out.println(result);
		
		

	}
}
