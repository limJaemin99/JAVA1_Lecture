package day06;

class Animal{
	String name;
	int age;
	String sound;
	
	// 기본생성자
	Animal(){};
	
	// 생성자 : Alt shift + s > o
	Animal(String name, int age, String sound) {
		this.name = name;
		this.age = age;
		this.sound = sound;
		System.out.println("안녕! 내 이름은 " + this.name + "! 나이는 " + this.age + "살!");
	}
	
	
	void eat(String foodName){
		System.out.println(name + ": " + foodName + " 먹는 중....냠냠");
	}
	

	void makeSomeNoise(){
		for (int i = 0; i < 3; i++) {
			System.out.println(this.name + ": " +this.sound);
		}
	}
}


public class Ex1_ClassTask {
	public static void main(String[] args) {
		/*
		 * 1. 이름, 나이, 울음소리
		 * 2. 먹기: 어떠한 음식을 먹기 / 소리지르기: 3번 울기
		 * 3. 동물 두마리 만들고 생성자를 통해 자유롭게 자기소개 문장 출력하기
		 * 4. 동물 두마리에게 2에서 만든 기능 중 아무거나 골라 동작하기
		*/
		
		// Animal(String name, int age, String sound)
		Animal dog = new Animal("재롱이", 8, "컹컹으르르르르");
		Animal cat = new Animal("쫀떡이", 4, "햐악!!!");
		
		dog.eat("사과");
		cat.makeSomeNoise();
		
		dog = cat;
		System.out.println(dog.name);
		
	}
}
