package p0906;

import java.util.Arrays;
import java.util.Scanner;

public class JA0906_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] lotto = new int[45]; // 전체번호
		int[] winLotto = new int[6]; // 당첨번호
		int[] mynum = new int[6]; // 입력번호

		// 1-45
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		} // for

		// 번호 섞기
		for (int i = 0; i < 500; i++) {
			int random = (int) (Math.random() * 45); // 0-44
			int temp = lotto[10];
			lotto[10] = lotto[random];
			lotto[random] = temp;

		} // for

		// 당첨번호 입력
		for (int i = 0; i < 6; i++) {
			winLotto[i] = lotto[i]; // 당첨번호
		} // for
		Arrays.sort(winLotto); //순차정렬

		// 나의 번호 입력부분
		for (int i = 0; i < 6; i++) {
			System.out.println("로또 번호를 입력하세요.(1-45)");
			mynum[i] = scan.nextInt();
		}
		Arrays.sort(mynum); //순차정렬

		// 번호 출력

		System.out.println("------------------");
		System.out.print("★나의 입력번호 : ");
		for (int i = 0; i < mynum.length; i++) {
			System.out.print(mynum[i] + " ");

		}
		System.out.println();

		// 당첨번호 출력
		System.out.print("당첨번호 : ");
		for (int i = 0; i < 6; i++) {

			System.out.print(winLotto[i] + " ");

		}
		System.out.println();

	}// main

}// class
