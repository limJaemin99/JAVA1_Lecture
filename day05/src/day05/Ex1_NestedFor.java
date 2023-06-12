package day05;

public class Ex1_NestedFor {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			System.out.println("i: " + i);
			for(int j=0; j<5; j++) {
				System.out.println(" j:" +j);
			}
			System.out.println();
		}
		
		for (int i = 0; i < 6; i++) {	// 줄 수
//			System.out.println("**********");
			for(int j=0; j<15; j++) {	// 옆으로 증가
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 실습문제
		// 2중for문을 이용해 별 출력하기
		//*
		//**
		//***
		//****
		//*****
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		// 2차원배열 [2][3] 
		int[][] arrData= {
							{10,20,30},
							{40,50,60}
							};
		
		for(int i=0; i<arrData.length; i++) {	// i=0~1
			for(int j=0; j < arrData[i].length; j++) {	//j= 0~2
				System.out.print(arrData[i][j] + " ");
			}
			System.out.println();
		}
	
		
	}
}
