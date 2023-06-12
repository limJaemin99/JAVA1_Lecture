package day05;

public class Ex2_Method {
	// f(x) = 2x + 1
	int f(int x) {
		return 2 * x + 1;
	}
	
	// 두 정수의 곱셈을 해 주는 메소드
	int multiply(int num1, int num2){
		int result = num1 * num2;
		return result;
	}
	
	// 내 이름 10번 출력하는 메소드
	void sayMyName(){
		for(int i=0; i <10; i++) {
			System.out.println("이예진");
		}
//		return;	// 생략가능
	}
	
	String max(int num1, int num2){
		// 조건식이 참일 경우에만 실행
		if(num1 > num2) return "첫번째가 더 큼";
		else return "뭐가 더 큰지 모름";
	}
	
	
	public static void main(String[] args) {
		Ex2_Method em = new Ex2_Method();
		
		// 반환타입이 있을 경우엔 변수에 값을 담아서 출력 해 준다.
		// 리턴값의 타입/ 선언부 리턴타입/ 리텁값 담을 변수 타입 >> 3개 모두 타입 일치★★
		int result= em.multiply(100, 200);
		System.out.println(result);
		
		em.sayMyName();		

		// 메소드 사용 이유: 메소드를 사용하지 않을 경우 반복해서 코드를 사용 해야한다.
		/*
		int[] nums= {10, 12, 14, 16};
		for (int i = 0; i < nums.length; i++) {
			System.out.println(3 * nums[i] + 10);	// 2x +1
		}
		
		// 100줄 코드 생략..
		for (int i = 0; i < nums.length; i++) {
			System.out.println(2 * nums[i] + 1);	// 2x +1
		}
		
		// 100줄 코드 생략..
		for (int i = 0; i < nums.length; i++) {
			System.out.println(2 * nums[i] + 1);	// 2x +1
		}
		*/

	}
	
}
