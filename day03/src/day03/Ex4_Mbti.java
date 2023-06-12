package day03;

import java.util.Scanner;

public class Ex4_Mbti {
	public static void main(String[] args) {
		// 사용자에게 MBTI를 입력받은 후,
		// 해당 MBTI에 맞는 문장 실행하기
		// 만약 해당하는 MBTI가 없다면 "업데이트 예정입니다" 출력하기
		
		// [선택지]
		// ESTP: 현실적이고 실용적이다.
		// ENFJ: 착하고, 예의 바르고, 리더쉽 있고, 성격이 좋다.
		// INFP: 상상력이 풍부하다, 참을성 많다, 온화하다.
		// ENFP: 분위기 메이커, 나무위키
		
		// switch문
		Scanner sc= new Scanner(System.in);
		System.out.println("당신의 MBTI는? ");
		String type = sc.next();
		
		/*		
		switch(type) {
		case "ESTP":
			System.out.println("현실적이고 실용적이다.");
			break;
		case "ENFJ":
			System.out.println("착하고, 예의 바르고, 리더쉽 있고, 성격이 좋다.");
			break;
		case "INFP":
			System.out.println("상상력이 풍부하다, 참을성 많다, 온화하다.");
			break;
		case "ENFP":
			System.out.println("분위기 메이커, 나무위키");
			break;
		default:
			System.out.println("업데이트 예정입니다.");
		}
		*/
		
		// if문으로 바꾸기
		// type == "ENFJ" (x)
		// 문자열 비교는 equals() 메소드를 사용
		// "문자열1".equals("문자열2") : "문자열1"과 "문자열2"가 동일하면 true
//		System.out.println("A".equals("A"));
		// equalsIgnoreCase(): 대소문자 구분x
		
		if(type.equalsIgnoreCase("ESTP")) {
			System.out.println("현실적이고 실용적이다.");
		}else if(type.equals("ENFJ")) {
			System.out.println("착하고, 예의 바르고, 리더쉽 있고, 성격이 좋다.");
		}else if(type.equals("INFP")) {
			System.out.println("상상력이 풍부하다, 참을성 많다, 온화하다.");
		}else if(type.equals("ENFP")) {
			System.out.println("분위기 메이커, 나무위키");
		}else {
			System.out.println("업데이트 예정입니다.");
		}
		
	}
}
