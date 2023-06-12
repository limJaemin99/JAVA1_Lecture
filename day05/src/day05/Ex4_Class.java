package day05;

class BungeoPpang{
	// 속성(변수)
	String type;
	String flour;
	int price;
	
	//기본생성자 
	BungeoPpang(){};
	
	// 생성자
	// BungeoPpang("팥", "50g", 5000)
	BungeoPpang(String type, String flour, int price){
		// this: 현재 생성중인 객체
		this.type = type;
		this.flour = flour;
		this.price = price;
		System.out.println("내 주소값은 " + this);
	}
	
	
	// 기능(메소드)
	void bake(){
		System.out.println("노릇노릇 굽는중...");
	}
	
	void eat() {
		System.out.println("붕어빵 쿰척");
	}
	
}


public class Ex4_Class {
	public static void main(String[] args) {
		
		// 객체생성
		BungeoPpang bung1 = new BungeoPpang();
		
		// 객체사용
		bung1.flour = "10g";	//flour= "10g"
		bung1.price = 1000;
		bung1.type = "슈크림";
		
		System.out.println(bung1.type + "붕어빵" + bung1.price + "원 어치 주세요");
		System.out.println("밀가루: " + bung1.flour + "넣기");
		
		bung1.bake();
		bung1.eat();
		
		System.out.println("bung1의 주소값: " + bung1);
		
		
//		BungeoPpang("10g", 1000, "슈크림")
		// BungeoPpang(String type, String flour, int price)
		BungeoPpang bung2 = new BungeoPpang("팥", "50g", 5000);
		System.out.println(bung2.type + "붕어빵" + bung2.price + "원 어치 주세요");
		System.out.println("밀가루: " + bung2.flour + "넣기");
		
		// 주소값 출력
		System.out.println("bung2의 주소값" + bung2);
		
		
		
		
		
	}

}
