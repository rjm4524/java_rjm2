package p0911;

import java.util.Scanner;

public class JA0911_08 {
	public static void main(String[] args) {
		//입력받고
		//계산하고
		//출력
		int result = 0;
		JA0911_08 j = new JA0911_08();
		result = j.addInput();
		
		System.out.println("결과값 : " + result);
	}//main
	
	
	
	//인스턴스 메소드 - 객체선언 후 참조변수명.변수명
	int addInput() {
		//입력받고 계산하기
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요.");
		int a = scan.nextInt();
		System.out.println("두번째 숫자를 입력하세요.");
		int b = scan.nextInt();
		int result = a+b;
		return result;
	}

}//class
