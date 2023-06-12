package school;

public class Human {
	private char gender;
	
	// 생성자
	public Human(){}
	
	public Human(char gender) {
		this.gender = gender;
	}
	
	public void printInfo() {
		System.out.println("=======나의 정보=======");
	}

	// getter, setter 만들기: alt + shift + s > r
	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
}
