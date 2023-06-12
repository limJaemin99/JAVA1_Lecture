package day08;

public class SuperCar extends Car{
	String pw;
	
	public SuperCar() {}

	// »ı¼ºÀÚ ÃÊ±âÈ­ ´ÜÃàÅ°: alt + shift + s > o
	public SuperCar(String brand, String color, int price, String pw) {
		super(brand, color, price);
		this.pw = pw;
	}

	@Override
	void drive() {
		System.out.println(brand + ": ½´ÆÛÄ« ºÎ¾Æ¾Ó!!");
	}
	
	void roofOpen() {
		System.out.println(brand + ": ¶Ñ²± ¿­¸®´Â Áß...");
	}
	
	void roofClose() {
		System.out.println(brand + "Ã³Ä¿´ö...(¶Ñ²±´İÈû)");
	}
	
}
