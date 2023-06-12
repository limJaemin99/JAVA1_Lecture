package day03;

import java.util.Scanner;

public class Ex2_ifTask {
	public static void main(String[] args) {
		// 문제!
		// 사용자에게 번호(1,2,3,4 번 중 택 1)를 입력받은 후
		// 해당 번호가 정답이라면 "정답입니다" 출력, 오답이라면 "오답입니다" 출력
		// 그 외의 번호를 입력했다면 "잘못 입력하셨습니다" 출력하기
		Scanner sc= new Scanner(System.in);
		System.out.println("다음 중 프로그래밍 언어가 아닌것은?"
				+ "\n1. C언어\n2. 파이썬\n3. JAVA\n4. 셰익스피어");
		
		int choice= sc.nextInt();
		if(choice == 4) {
			System.out.println("정답입니다.");
		}else if(choice == 1 || choice == 2 || choice == 3) {
			System.out.println("오답입니다.");
		}else {
			System.out.println("잘못 입력 하셨습니다!");
		}
	
		
		
	}
}
