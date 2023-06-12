package day04;

import java.util.Scanner;

public class Ex2_WhileTest {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int choice= 0;
		/*		
		while(choice != 2) {
			System.out.println("다음 중 JAVA1 을 맡은 강사 이름은?"
					+ "\n1. 손예진\n2. 이예진\n3. 이순신\n4. 떡볶이");
			choice = sc.nextInt();
			switch(choice) {
			case 1: case 3: case 4:
				System.out.println("가방싸서 나가세요\n");
				break;
			case 2:
				System.out.println("정답입니다 ^^*");
				break;
			default:
				System.out.println("잘못된 번호를 입력하셨습니다!");
			}
		}
		*/
		/*
		do {
			System.out.println("다음 중 JAVA1 을 맡은 강사 이름은?"
					+ "\n1. 손예진\n2. 이예진\n3. 이순신\n4. 떡볶이");
			choice = sc.nextInt();
			switch(choice) {
			case 1: case 3: case 4:
				System.out.println("가방싸서 나가세요\n");
				break;
			case 2:
				System.out.println("정답입니다 ^^*");
				break;
			default:
				System.out.println("잘못된 번호를 입력하셨습니다!");
			}
			
		}while(choice != 0);
		*/
	
		// 무한반복
		while(true) {
			System.out.println("다음 중 JAVA1 을 맡은 강사 이름은?"
					+ "\n1. 손예진\n2. 이예진\n3. 이순신\n4. 떡볶이");
			choice = sc.nextInt();
			
			if(choice == 0) {
				System.out.println("퇴장하셨습니다");
				break;
			}
			
			switch(choice) {
			case 1: case 3: case 4:
				System.out.println("가방싸서 나가세요\n");
				break;
			case 2:
				System.out.println("정답입니다 ^^*");
				break;
			default:
				System.out.println("잘못된 번호를 입력하셨습니다!");
			}
		}


		
	}
}
