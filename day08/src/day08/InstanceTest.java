package day08;

public class InstanceTest {
	public static void main(String[] args) {
		Car c1= new Car();
		SuperCar su= new SuperCar("페라리", "white", 20_000, "abcd");
		
		c1.doBreak(su);
		
		ToyCar to = new ToyCar("타요버스", "Blue", 300_000);
		c1.doBreak(to);
		
		// 업캐스팅
		Car upCar= new SuperCar();
		
		// 부모객체 instanceof 부모클래스: true
		System.out.println(c1 instanceof Car);
		
		// 자식객체 instanceof 자식클래스: true
		System.out.println(su instanceof SuperCar);
		
		// A의 자식객체 instanceof B의 자식클래스: 에러
//		System.out.println(to instanceof SuperCar);
		
		// 자식객체 instanceof 부모클래스 : true
		System.out.println(su instanceof Car);
		
		// 부모객체 instanceof 자식클래스: false
		System.out.println(c1 instanceof SuperCar);
		
		// Car upCar= new SuperCar();
		// 업캐스팅객체 instanceof 부모클래스: true
		System.out.println(upCar instanceof Car);
		
		// 업캐스팅객체 instanceof 자식클래스: true
		System.out.println(upCar instanceof SuperCar);
		
		
	}
}
