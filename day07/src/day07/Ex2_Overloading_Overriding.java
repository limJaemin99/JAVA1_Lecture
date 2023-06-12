package day07;

class Monkey{
	String name;
	int age;
	
	// 기본생성자
	Monkey(){}
	
	// 생성자 단축키: alt + chift + s > o
	// 생성자 오버로딩
	Monkey(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void walk() {
		System.out.println("두발 또는 네발로 걷기");
	}
	
	void eat() {
		System.out.println("바나나 먹기 냠냠");
	}

	// 오버로딩: 매개변수의 갯수와 타입이 다르다.
	void eat(String food) {
		System.out.println(food + " 먹는중");
	}
	
	// 오버로딩
	void eat(int foodCnt) {
		System.out.println(foodCnt + "인분 바나나 먹기");
	}
}

class Human extends Monkey{
	int money;
	String job;
	
	@Override
	void walk() {
		System.out.println("두발로 걷기");
	}
	
	@Override
	void eat() {
		System.out.println("밥 먹기 쿰척");
	}
	
	// 오버로딩: 매개변수 타입 또는 매개변수 갯수가 다르다.
	void walk(String place) {
		System.out.println(place + " 걷기");
	}
	
	// 리턴타입은 오버로딩이 성립되지 않는다.
	/*
	String walk(String place) {
		System.out.println(place + " 걷기");
		return place;
	}
	*/
	
	// 메소드 선언
	void sleep() {
		System.out.println("자는중...Zzz");
	}
	
}

public class Ex2_Overloading_Overriding {
	public static void main(String[] args) {
		Monkey mk= new Monkey();
		mk.eat();
		mk.eat("간식");
		mk.eat(100);
		
		Human man = new Human();
		man.eat();	// 오버라이딩
		man.eat("치킨");	// 부모클래스의 메소드
		man.walk();	// 오버라이딩
		man.walk("한강 공원");		// 오버로딩
	}
}












