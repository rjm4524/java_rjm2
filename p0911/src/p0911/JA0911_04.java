package p0911;

import java.util.Scanner;

public class JA0911_04 {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("첫번째 숫자를 입력하세요. (0입력시 종료)");
			a = scan.nextInt();
			if (a == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
				System.out.println("두번째 숫자를 입력하세요.");
				b = scan.nextInt();

				JA0911_04 j = new JA0911_04(); // 객체선언
				int result = j.max(a, b); // 변수 result를 안 쓰면 리턴은 돌아오지만 받을 공간이없다.
				System.out.println("큰수 : " + result);
			
		}

	}

	// static있으면 클래스 메소드(클래스명.메소드명,) static이 없으면 인스턴스 메소드(참조변수명.메소드명)
	int max(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

}
