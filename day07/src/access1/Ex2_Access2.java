package access1;

public class Ex2_Access2 {
	public static void main(String[] args) {
		Ex1_Access1 a1= new Ex1_Access1();
		System.out.println(a1.data1);	// public ok
		System.out.println(a1.data2);	// protected ok
		System.out.println(a1.data3);	// default ok
//		System.out.println(a1.data4);	// private ¿¡·¯
	}
}
