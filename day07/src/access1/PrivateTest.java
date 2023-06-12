package access1;

class Calender{
	// 그리드모드: alt + shift a
	private int year;
	private int month;
	private int date;
	
	// getter, setter 만들기: alt + shift + s > r
	// getter: 값 사용, setter: 값 대입
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			System.out.println("올바른 숫자를 입력하세요");
			return;
		}
		this.month = month;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	
}



public class PrivateTest {
	public static void main(String[] args) {
		Calender cal = new Calender();
		cal.setMonth(5);	// cal.month = 12;
		System.out.println(cal.getMonth());	//cal.month
	}

}
