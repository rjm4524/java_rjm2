package p0905;

import java.util.Scanner;

public class JA0905_08 {

	public static void main(String[] args) {
		
		//랜덤숫자 생성
		Scanner scan = new Scanner(System.in);
		
		int round = (int)(Math.random()*100)+1;
		System.out.println("숫자맞추기 게임입니다.");
		
		//숫자맞추기
		while(true) { 
			System.out.println("1부터100사이 숫자를 입력하세요");
			int num = scan.nextInt();
			if(round==num) {
				System.out.println("정답입니다,");
				break;
			
			}
		}
		
		
		
//		
//		int i=0;
//		while(true) {
//			System.out.println(i);
//			i++;
//		}
//		
		
		
		
		
		
		
//		int i=0;
//		for(;;i++) {
//			System.out.println(i);
//		}

	}

}
