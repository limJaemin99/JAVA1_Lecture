package day07;

// 부모
class Parent{
	int data;
	
	void talk() {
		System.out.println("안녕~");
	}
}

// 자식
class Child extends Parent{
	int age;
}

public class Ex1_Inheritance {
	public static void main(String[] args) {
		Child ch = new Child();
		// 상속을 받았기 때문에 부모 클래스에 있는 요소들도 사용 가능
		ch.data = 100;
		ch.talk();
	}
}
