package access2;

// 다른 패키지에 있는 클래스를 사용할 경우 import 해야 한다.
import access1.Ex1_Access1;

class MyAccess extends Ex1_Access1{
	
	void printAccess(){
		System.out.println(data1);	// public ok
		System.out.println(data2);	// protected ok
//		System.out.println(data3);	// default 에러
//		System.out.println(data4);	// private 에러
	}
}

public class Ex3_Access3 {
	public static void main(String[] args) {
		Ex1_Access1 a1= new Ex1_Access1();
		System.out.println(a1.data1);	// public ok
//		System.out.println(a1.data2);	// protected 에러
//		System.out.println(a1.data3);	// default 에러
//		System.out.println(a1.data4);	// private 에러
	}
}
