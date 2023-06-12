package day04;

import java.util.Scanner;

public class Ex4_ArTask {
	public static void main(String[] args) {
		// 1~10 까지 배열에 담고 출력
		// 1~100 까지 배열에 담은 후 홀수만 출력
		// 1~100까지 배열에 담은 후 짝수의 합 출력
		// A~F 까지 배열에 담고 출력
		// 5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
		// aBcDeFg...Z 배열에 담고 출력
		// 영어 문자열을 입력 받은 후 소문자는 대문자로, 대문자는 소문자로 변경
		
		System.out.println("1~10 까지 배열에 담고 출력");
		int[] arData= new int[10];
//		arData[0]= 1;
//		arData[1]= 2;
//		arData[2]= 3;
//		arData[3]= 4;
//		arData[4]= 5;
//		...
//		System.out.println(arData[0]);
		for(int i=0; i<arData.length; i++) {	// i = 0~9
			arData[i] = i+1;
//			System.out.println(arData[i]);
		}
		
		
		System.out.println("1~100 까지 배열에 담은 후 홀수만 출력");
		// 100개를 담는다
		// 어떻게 담지? 하나씩? for문?
		// 홀수만 출력... i % 2 == 1			
		int[] arData2= new int[100];
		for(int i =0; i<arData2.length; i++) {	// i= 0~99
			if(i % 2 == 1) {
				arData2[i]= i;
//				System.out.println(arData2[i]);
			}
		}
		
		System.out.println("1~100까지 배열에 담은 후 짝수의 합 출력");
		int[] hundData= new int[100];
		int cnt = 0;
		for(int i=0; i<hundData.length; i++) {
			hundData[i] = i + 1;	// 1~100 까지 담음
			if(hundData[i] % 2 == 1) {
				continue;	// 만약 홀수가 나오면 cnt에 수를 누적 시키지 않고, 짝수일 경우에만 더한다.
			}
			cnt += hundData[i];
		}
		System.out.println(cnt);
		
		System.out.println("A~F 까지 배열에 담고 출력");
		// A B C D E F
		// 65 66 67 68 69 70
		int[] alpha = new int[6];
		for(int i=0; i<alpha.length; i++) {
			alpha[i] = (char)(65 +i);
			System.out.println((char)alpha[i]);
		}
		
/*		
		System.out.println("5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력");
		Scanner sc= new Scanner(System.in);
		int[] intData = new int[5];
		int max=0, min=0;
		for(int i=0; i<intData.length; i++) {
			System.out.println(i+1 + "번째 정수");
			intData[i] = sc.nextInt();	// 사용자가 입력받은 값을 순서대로 배열에 담는다.
		}
		
		// 첫번째로 입력받은 인덱스 값을 max와 min에 각각 담아 기준점으로 삼는다.
		max= intData[0];
		min= intData[0];
		
		// 0번째 값을 이미 max와 min이 담고 있기 때문에 굳이 0번째 방끼리 비교할 필요가 없다. 따라서 i의 1부터 시작
		for(int i=1; i<intData.length; i++) {
			if(intData[i] > max) {
				max = intData[i];
			}// 초기반복 때 intData[1~4]에 들어오는 숫자가 intData[0]보다 크면 해당 숫자가 max로 값이 변경
			if(intData[i] < min) {
				min = intData[i];
			}// 초기반복 때 intData[1~4]에 들어오는 숫자가 intData[0]보다 작으면 해당 숫자가 min로 값이 변경
		}
		
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
		*/
		
		// aBcDeFg...Z 배열에 담고 출력
		int[] alphabet = new int[26];
		
		// 짝수 일때 알파벳 소문자(97~), 홀수 일때 알파벳 대문자(65~)
		for(int i=0; i<alphabet.length; i++) {
			alphabet[i] = i % 2==0? i +97 : i + 65;
			System.out.print((char)alphabet[i]);
		}
		
		System.out.println();
		// 영어 문자열을 입력 받은 후 소문자는 대문자로, 대문자는 소문자로 변경
		// 문자열 > 문자
		// 문자열.charAt(1)
		Scanner sc= new Scanner(System.in);
		String msg = "영단어를 입력하세요", result="";
		String str= null;
		char c= ' ';
		
		System.out.println(msg);
		str = sc.next();
		for(int i=0; i<str.length(); i++) {
			c = str.charAt(i);	//str에 입력받은 문자열을 하나씩 가져와서 char타입으로 바꾼다.
			
			// c 의 입력값 중 대문자>소문자, 소문자 > 대문자
			if(c >= 65 && c <=90) {	// 대문자일 경우
				result += (char)(c+32);
			}else if ( c >= 97 && c<= 122) {	//소문자일 경우
				result += (char)(c - 32);
			}
		}
		System.out.println(result);
		
		
		
		
		
		
		
		
	}
}
