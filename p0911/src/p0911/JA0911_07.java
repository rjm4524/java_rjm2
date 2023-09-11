package p0911;

import java.util.Scanner;

public class JA0911_07 {
	static Scanner scan = new Scanner(System.in);
	

	public static void main(String[] args) {
		System.out.println("학번을 입력하세요.");
		int stuNum = scan.nextInt();
		String nme = nameInput();
		int kr = korInput();
		//int kor 
		
		
		
		
		System.out.println("학번 :" + stuNum);
		System.out.println("이름 :" + nme);
		System.out.println("국어점수 :" + kr);
	}

	static String nameInput() {
		String name = ""; // 지역변수 - 메소드내에 선언 되어있기에.
		System.out.println("이름을 입력하세요.");
		name = scan.next();
		return name;
	}
	
	static int korInput() {
		System.out.println("국어점수를 입력하세요.");
		int kor;
		kor = scan.nextInt(); 
		return kor;
	}

}
