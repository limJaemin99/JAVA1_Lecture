package access1;

public class Ex1_Access1 {
	public int data1= 10;	// 접근제한 없음
	protected int data2= 20;	// 같은 패키지 + 다른 패키지의 자손클래스
		int data3 = 30;	// 같은 패키지
	private int data4= 40;	// 같은 클래스
}
