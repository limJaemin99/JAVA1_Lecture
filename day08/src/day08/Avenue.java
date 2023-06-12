package day08;

public class Avenue {
	public static void main(String[] args) {
		// 주차장에는 여러 타입의 자동차들이 있다.
		// 여러 타입의 자동차들을 각각 관리하지 않고, 주차장에 한번에 넣어 관리하도록 한다.
		
		// 부모타입의 객체배열에 여러 자식들의 객체를 담을 수 있다.(다형성의 장점)
		Car[] parkingLot = new Car[3];
		parkingLot[0] = new Car("K9", "Black", 7000);
		parkingLot[1] = new SuperCar("Benz", "Red", 30000,"1234");	// 업캐스팅
		parkingLot[2] = new ToyCar("벤츠 NEW GTR", "White", 150_000);	// 업캐스팅
		
		// 하나의 부모타입으로 각각 다른 형태의 메소드(오버라이딩) 사용
		for (int i = 0; i < parkingLot.length; i++) {
			parkingLot[i].drive();
		}
		
		// [실습문제]
		// 캐스팅을 통해 자식필드에만 존재하는 메소드 자유롭게 사용하기(Car클래스 객체 제외)
		
		// 다운 캐스팅으로 다시 자식필드를 사용가능
		System.out.println("-------------다운캐스팅------------");
		SuperCar momcar= (SuperCar)parkingLot[1];
		momcar.roofOpen();
		momcar.roofClose();
		
		ToyCar dadcar = (ToyCar)parkingLot[2];
		dadcar.charging();
		
		System.out.println();
		System.out.println("-----------------instanceof-----------------");
		for (int i = 0; i < parkingLot.length; i++) {
			// parkingLot[i] 에는 여러타입의 객체들이 담겨있고, instanceof를 통해 여러 객체의 타입을 구별
			if(parkingLot[i] instanceof SuperCar) {
				System.out.println(parkingLot[i].brand + "는 슈퍼카 입니다.");
				parkingLot[i].drive();
			}else if(parkingLot[i] instanceof ToyCar) {
				System.out.println(parkingLot[i].brand + "는 장난감 자동차 입니다.");
				parkingLot[i].drive();
			}
			
		}
		
		
 	}
}
