package school;

public class Teacher extends Human{
	// 그리드모드: alt + shift a
	private String className;
	private String name;
	private int age;
	
	Teacher(){}
	
	// 접근제어자를 부모클래스의 메소드보다 좁은 범위로 변경할 수 없다.
	@Override
	public void printInfo() {
		System.out.println("====== 교수님 정보 ======");
	}
	
	// getter, setter 만들기: alt + shift + s > r
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
