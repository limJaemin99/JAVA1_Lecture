package day07;

/*자동차 클래스 선언(부모)
 * brand, price 선언
 * 열쇠로 시동켜기 keyOn
 * 열쇠로 시동끄기 keyOff
 * 
 * 슈퍼카 클래스 선언(자식)
 * 열쇠로 시동켜기 > 음성으로 시동켜기 로 변경
 * 열쇠로 시동끄기 > 음성으로 시동끄기 로 변경
 * 뚜껑열기(doorOpen), 뚜껑닫기(doorClose)
 * brand 와 price 초기화하기
 * 
*/

class Car{
	String brand;
	int price;
	
	Car(){
		System.out.println("나는 부모 생성자~!");
	}
	
	Car(String brand, int price){
		this.brand = brand;
		this.price = price;
	}
	
	void keyOn() {
		System.out.println("철커덕 열쇠로 시동을 킵니다.");
	}
	
	void keyOff() {
		System.out.println("철커덕 열쇠로 시동을 끕니다.");
	}
}

class SuperCar extends Car{
	// SuperCar mycar = new SuperCar("BMW", 10000);
	
	SuperCar(){
//		super();
	}
	
	// 생성자
	SuperCar(String brand, int price){
		super(brand, price);	// 부모생성자 Car()
		// Car(String brand, int price)
	}
	
	@Override
	void keyOn() {
		System.out.println("슈퍼카야~~ 시동켜줘~~");
	}
	
	@Override
	void keyOff() {
		System.out.println("슈퍼카야~~ 시동꺼줘~~");
	}
	
	void doorOpen() {
		System.out.println("뚜껑 여는중...");
	}
	
	void doorClose() {
		System.out.println("뚜껑 닫는중...");
	}
}


public class Ex3_InheritanceTask {
	public static void main(String[] args) {
		SuperCar mycar = new SuperCar("BMW", 10000);
		mycar.keyOn();
		mycar.keyOff();
		mycar.doorOpen();
		mycar.doorClose();
	}
}






