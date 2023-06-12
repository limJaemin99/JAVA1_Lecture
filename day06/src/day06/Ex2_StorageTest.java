package day06;

// 지역변수: lv / 인스턴스 변수: iv / 클래스 변수: cv
class Variable{
	static String str= "Hello";	//cv
	int data;	//iv
	
	// 인스턴스 메소드
	void v1() {
		int data= 10;	//lv
		System.out.println("지역변수: " + data);
		System.out.println(str);	// cv 사용가능
		v1(100);	// static 메소드 사용가능
	}
	
	// static 메소드
	static void v1(int num) {
		System.out.println("지역변수: " + num);	// lv 사용가능
		System.out.println("클래스 변수: " + str);	// cv 사용가능
//		System.out.println(data);	// iv 에러!!
//		v1();	// im 에러!!
	}
}

public class Ex2_StorageTest {
	public static void main(String[] args) {
		/*
		// 인스턴스 변수는 객체 생성 없이 사용불가능
		Variable vr = new Variable();
		System.out.println(vr.data);
		vr.v1();
		
		 */
		Variable vr2 = new Variable();
		
		// 클래스 변수는 객체 생성 없이 사용가능! 객체로도 호출은 가능하지만 권장x
//		System.out.println(Variable.str);
		
		// 클래스 변수는 모든 객체들과 값을 공유한다.
//		vr.str= "I'm hungy";
//		System.out.println(vr.str);
//		System.out.println(vr2.str);
		
		/*메소드의 종류*/
		// 인스턴스 메소드
		vr2.v1();
		
		// static 메소드
		Variable.v1(100);
		
	}

}
