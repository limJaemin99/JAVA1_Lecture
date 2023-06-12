package day04;

public class Ex1_Continue {
	public static void main(String[] args) {
		// break
		for (int i = 0; i < 10; i++) {
			if(i == 4) {
				break;
			}
//			System.out.println(i);
		}
		
		// continue
		for (int i = 0; i < 10; i++) {
			if(i == 4) {
				continue;
			}
			System.out.println(i);
		}
	}
}
