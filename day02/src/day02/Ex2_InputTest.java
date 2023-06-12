package day02;

import java.util.Scanner;

public class Ex2_InputTest {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("이름: ");
		String name1= sc.next();
		String name2= sc.next();
		System.out.println("성: " + name1);
		System.out.println("이름: " + name2);
		System.out.println(name2 + "님 반갑습니다~");
		System.out.println("주소: ");
		sc.nextLine();
		String addr = sc.nextLine();
		System.out.println("사는곳: " + addr);
		System.out.println("나이: ");
		int age = sc.nextInt();
		System.out.println("현재 나이: " + age);
		System.out.println("5년뒤 나이: " + (age+5));
	}
}
