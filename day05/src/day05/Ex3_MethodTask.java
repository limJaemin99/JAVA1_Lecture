package day05;

public class Ex3_MethodTask {
	/*
	 * 1~10까지 println()으로 출력하는 메소드
	 * 1~10까지의 합 구해주는 메소드
	 * 이름을 n번 만큼 출력 하는 메소드
	 * 1~n까지의 합을 구해주는 메소드
	 * 세정수의 뺄셈을 해주는 메소드
	 * 두 정수의 나눗셈 결과를 구해주는 메소드(소수점까지 출력)
	 * 홀수를 짝수로, 짝수를 홀수로 바꿔주는 메소드
	*/
	
	// 1~10까지 println()으로 출력하는 메소드
	void print1To10(){
		for (int i = 0; i < 10; i++) {
			System.out.println(i +1);
		}
	}
	
	// 1~10까지의 합 구해주는 메소드
	int sum1To10(){
		int total= 0;
		for (int i = 0; i < 10; i++) {
			total += i+1;
		}
		return total;
	}
	
	// 이름을 n번 만큼 출력 하는 메소드
	void printName(String name, int n){
		for (int i = 0; i < n; i++) {
			System.out.println(name);
		}
	}
	
	// 1~n까지의 합을 구해주는 메소드
	int getTotalN(int n){
		int total= 0;
		for (int i = 0; i < n; i++) {
			total += i + 1;
		}
		return total;
	}
	
	// 세정수의 뺄셈을 해주는 메소드
	int sub(int num1, int num2, int num3){
		return num1 - num2 -num3;
	}
	
	// 두 정수의 나눗셈 결과를 구해주는 메소드(소수점까지 출력)
	double div(int num1, int num2){
		return (double)num1/num2;
	}
	
	// 홀수를 짝수로, 짝수를 홀수로 바꿔주는 메소드
	int change(int num1){
		return ++num1;
	}
	
	// 과제!!!!!!!!!!!!!!!!!!!!!!!!!!!
	// 사용자가 입력한 문자열 중 사용자가 원하는 문자는 몇개인지 구해주는 메소드
//		ex) "안녕안녕" 중 '녕 의 갯수? 2개
	
	
	// 5개의 정수를 배열로 입력받은 후, 해당 배열에서 원하는 번째 값을 구해주는 메소드
	
	
	// 한글로 된 숫자를 정수로 바꿔주는 메소드("일이일이" >> 1212)
	
	
	
	
	
	
	
}
