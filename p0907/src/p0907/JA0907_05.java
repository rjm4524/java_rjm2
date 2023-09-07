package p0907;

import java.util.Scanner;

public class JA0907_05 {

	public static void main(String[] args) {
		// 주택복권 1조 12345 1:0-9까지 조 00000-99999
		// 5- 1000원 45-10000원 345-10만원 2345-100만원 12345-1천만원
		// 1-12345 1억원
		Scanner scan = new Scanner(System.in);

		// 1조 - 0-9까지
		int fN = (int) (Math.random() * 9) + 1; // (int)(Math.random()*9)+1 = 1~9까지
		int sN = (int) (Math.random() * 100000);// 0~99999까지
		// String.format 을 넣어서 String타입으로 변경.
		String strNo = String.format("%05d", sN);
		// System.out.println(sN);
		System.out.println(strNo);
		String winNum = fN + "조" + strNo;
		System.out.printf("당첨번호 :%s\n", winNum);
		// System.out.printf("당첨번호 :%s",winNum); //%d: 정수 %f: 실수 %s:문자열 %c:문자

		// 입력 받기
		System.out.println("조 단위를 입력하세요.(1-9까지)");
		int input1 = scan.nextInt();
		System.out.println("뒷번호 5자리를 입력하세요.(00000~99999까지)");
		String input2 = scan.next();
		String input3 = input1 + "조" + input2;
		System.out.println("입력번호 :" + input3);

		int count = 0; // 일치 횟수

		if (input3.charAt(6) == winNum.charAt(6)) {
			count++;
			if (input3.charAt(5) == winNum.charAt(5)) {
				count++;
				if (input3.charAt(4) == winNum.charAt(4)) {
					count++;
					if (input3.charAt(3) == winNum.charAt(3)) {
						count++;
						if (input3.charAt(2) == winNum.charAt(2)) {
							count++;
							if (input3.charAt(0) == winNum.charAt(0)) {
								count++;
								
							}
						}
					}
				}
			}
		}

		if (count == 0) {
			System.out.println("꽝입니다.");
		} else if (count == 1) {
			System.out.println("1개맞추셨습니다.");
		} else if (count == 2) {
			System.out.println("2개맞추셨습니다.");
		} else if (count == 3) {
			System.out.println("3개맞추셨습니다.");
		} else if (count == 4) {
			System.out.println("4개맞추셨습니다.");
		} else if (count == 5) {
			System.out.println("5개맞추셨습니다.");
		} else if (count == 6) {
			System.out.println("정답입니다.");
		}

	}// main

}// class
