package p0919;

import java.util.Scanner;

public class JA0919_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println("for문을 실행할까요?");
		int choice = scan.nextInt();
		if (choice == 1) {
			for (int i = 0; i < 10; i++) {
				System.out.println(i + 10);
				try {//예외가 발생이 될 것 같은부분
					System.out.println(10 / 0); // airthmeticException
				} catch (Exception e) {
					System.out.println("예외가 발생이 되었지만 프로그램을 계속 진행합니다.");
				}
			}
		}

		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);

	}

}