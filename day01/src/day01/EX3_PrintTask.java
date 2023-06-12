package day01;

// 클래스 생성: package 누르고 + Ctrl + N > 만들 파일 선택
public class EX3_PrintTask {
	// main메소드: main + Ctrl + space + enter
	// main메소드: 프로그램의 진입점, 프로그램 흐름의 시작
	public static void main(String[] args) {
		// 출력메소드 실습
		// "오늘"은 3월 12일 입니다.
		// 토요일 이죠
		// 위의 결과처럼 출력하기
		// 조건1. 오늘은 쌍따옴표로 강조하여 출력("오늘")
		// 조건2. 숫자는 문자열에 넣지 않고, 정수로 사용하기
		// 조건3. print() 메소드만 사용하기
		
		System.out.print("\"오늘\"은" + 3 + "월" + 12 + "일 입니다.\n토요일입니다.");
//		System.out.print("\n토요일이죠");
	}
}
