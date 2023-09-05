package p0904;

import java.util.Scanner;

public class JA0904_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 90점 이상이면 A, 80점이상이면 B, 70점이상 C, 60점 이상 D, F
		
		System.out.println("점수를 입력하세요.");
		int x = scan.nextInt();
		if (x>=90) {
			System.out.println("학점은 A입니다.");
		}else if (x>=80) {
			System.out.println("학점은 B입니다.");
		}else if (x>=70) {
			System.out.println("학점은 C입니다.");
		}else if (x>=60) {
			System.out.println("학점은 D입니다.");
		}else {
			System.out.println("학점은 F입니다.");
		}
		
		System.out.println("점수 :" + x);
		
		
		
		
		
		
		//숫자를 입력 받아 0보다 크면 0이상인 숫자 입니다.
		// 0보다 작으면 0미안인 숫자 입니다.
		// 0이면 0입니다.
		
//		System.out.println("점수를 입력하세요.");
//		int x = scan.nextInt();
//		if(x<0) {
//			System.out.println("0보다 작은 수 입니다.");
//		}else if(x>0) {
//			System.out.println("0보다 큰 수 입니다.");
//		}else {
//			System.out.println("0 입니다.");
//			
//		}
//		
//		System.out.println("숫자 : " + x);
		
		
//      ---------------------------------------
		//점수를 입력받아 60점이상 합격
//		System.out.println("점수를 입력하세요.");
//		int score = scan.nextInt();
//		
//		if(score>=60) {
//			System.out.println("합격입니다.");
//		}else {
//			System.out.println("불합격입니다.");
//		}
//		System.out.println("점수 :" + score);
		

	}//main

}//class
