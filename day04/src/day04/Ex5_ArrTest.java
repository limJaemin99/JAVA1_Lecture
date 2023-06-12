package day04;

public class Ex5_ArrTest {
	public static void main(String[] args) {
		// 2차원 배열 생성 [2][3]
		int[][] arrData = {
							{10, 20, 30},
							{40, 50, 60}
							};
//		System.out.println(arrData[0][0]);
//		System.out.println(arrData[1][1]);
		
		// 0행 출력하기
		for(int i=0; i<arrData[0].length; i++) {
//			System.out.println(arrData[0][i]);
		}
		
		// 2차원 배열의 값 모두 출력
		for(int i=0; i<6; i++) {
			System.out.println(arrData[i/3][i%3]);
		}
		
		System.out.println("arrData: " + arrData);
		System.out.println("arrData[0]: " + arrData[0]);
		System.out.println("arrData[1]: " + arrData[1]);
		
		
	}
}
