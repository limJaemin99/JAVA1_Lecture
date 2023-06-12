package day06;

import java.util.Scanner;

class SuperCar{
	String brand;
	String color;
	int price;
	String pw= "0000";	//초기 비밀번호
	boolean check; // 자동차의 시동상태. true일 경우 시동켜짐. false일 경우 시동꺼짐
	int policeCount;	// 자동차 비밀번호 오류횟수
	
	// 기본생성자
	SuperCar(){};
	
	// 생성자 : Alt shift + s > o	
	SuperCar(String brand, String color, int price, String pw) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.pw = pw;
	}
	
	// 메소드
	void engineStart(){
		System.out.println("시동이 켜졌습니다.");
	}

	void engineStop(){
		System.out.println("시동이 꺼졌습니다.");
	}
	
	// 비밀번호 검사
	boolean checkPw(String pw){
		return this.pw.equals(pw);
	}
	
}


public class CarShop {
	public static void main(String[] args) {
		/*[심화 문제]
		 * 비밀번호 4자리를 입력받은 후 자동차 비밀번호와 일치하면 시동켜기
		 * 1. 슈퍼카 자동차를 만들고 비밀번호를 변경한다.(초기설정 비밀번호x)
		 * 2. 비밀번호를 3회이상 연속으로 틀릴 경우 "경찰 출동"메세지를 출력한다.
		 * 3. 시동이 켜지거나 꺼지면 메소드를 사용 해 알맞은 메세지를 출력하게 한다.
		 * 4. 시동이 켜지거나, 꺼질 경우 프로그램을 종료한다.
		*/
		
		// SuperCar(String brand, String color, int price, String pw)
		SuperCar ferrari = new SuperCar("Ferrari" , "White", 51500, "abcd");
		Scanner sc= new Scanner(System.in);
		int choice= 0;
		String password= "";
		
		while(true) {
			System.out.println("1. 시동켜기\n2. 시동끄기");
			choice = sc.nextInt();
			
			// true? 비밀번호 일치! 시동이 켜짐! false? 비밀번호 불일치!
			
			switch(choice) {
			case 1:
				// 사용자에게 비밀번호 입력받기
				System.out.println("비밀번호: ");
				 password = sc.next();
				 // 일치하는지 어떻게 알지? 
				 if(ferrari.checkPw(password)) {
					 // 사용자가 입력한 비밀번호가 일치할 경우
					 ferrari.engineStart();
					 ferrari.check =true;
					 ferrari.policeCount = 0;
				 }else {
					 // 2. 비밀번호를 3회이상 연속으로 틀릴 경우 "경찰 출동"메세지를 출력한다.
					 // 사용자가 입력한 비밀번호가 불일치할 경우
					 // policeCount 사용하기!
					 ferrari.policeCount++;
					 System.out.println("비밀번호 " + ferrari.policeCount + "회 오류. 3회 이상 오류발생 시 경찰 출동!!");
					 if(3 <= ferrari.policeCount) {
						 System.out.println("경찰출동!!!!!");
					 }
				 }
				break;
				
			case 2:
				ferrari.engineStop();
				ferrari.check= false;
				break;
			}	// switch
			// check가 true일 경우에 break;를 통해 반복문 탈출!
			if(ferrari.check == true || choice == 2) break;
		}	// while
		
		
		
		
	}	// main
}	// class
