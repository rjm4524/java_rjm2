package p0907;

import java.util.Scanner;

public class JA0907_09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1.선언
		// 2.로또번호 순차입력
		// 2.로또숫자 설정
		// 3.섞기

		// 선언
		int[] lotto = new int[45];
		int[] mynum = new int[6];
		int[] winNum = new int[6];
		int count = 0;
		int temp = 0;

		// 로또번호 순차입력
		for (int i = 0; i < 45; i++) {
			lotto[i] = i + 1;
		} // for

		// 섞기
		for (int i = 0; i < 500; i++) {
			int random = (int) (Math.random() * 45);
			lotto[0] = lotto[random];
			lotto[random] = temp;
			temp = lotto[0];
			// System.out.println(lotto[i]);
		} // for
			// 당첨번호 만들기
		for (int i = 0; i < 6; i++) {
			winNum[i] = lotto[i];

		} // for

		// 내번호 직접입력
		for (int i = 0; i < 6; i++) {
			System.out.println("번호를 입력하세요.");
			mynum[i] = scan.nextInt();
		}
		// 당첨갯수 확인

		// 내번호 출력 및 당첨번호 출력
		System.out.print("내가 입력한 번호 :");
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d ", mynum[i]);

		}
		System.out.println();

		System.out.print("당첨번호 : ");
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d ", winNum[i]);
		}
		System.out.println();

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (mynum[i] == winNum[i]) {

					count++;
					break;

				}
			}
		}
		System.out.println("당첨갯수 : " + count);

	}

}
