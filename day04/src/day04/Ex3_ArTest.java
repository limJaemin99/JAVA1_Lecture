package day04;

public class Ex3_ArTest {
	public static void main(String[] args) {
		int data0 = 1;
		int data1 = 2;
		int data2 = 3;
		int data3 = 4;
		
		// 배열 선언 + 생성
		int[] arData = new int[5];
		arData[0] = 100;
		arData[1] = 200;
		arData[2] = 300;
		arData[3] = 400;
		arData[4] = 500;
		
//		System.out.println("arData 0번째 방: " + arData[0]);
		for (int i = 0; i < 5; i++) {
//			System.out.println(arData[i]);
		}
		
		// 배열 선언 + 생성 + 초기화
		int[] arData2 = {10, 20, 30, 40, 50};
		System.out.println(arData2);	// 주소값
		
//		for (int i = 0; i < 5; i++) {	// i= 0~4
//			System.out.println(arData2[i]);	// i의 범위가 배열의 인덱스 범위보다 더 크기 때문에 오류 발생
//		}
		
		// 배열의 길이
		System.out.println(arData2.length);
		for(int i=0; i<arData2.length; i++) {
			System.out.println(arData2[i]);
		}
	
		
	}
}
