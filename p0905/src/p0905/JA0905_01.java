package p0905;

import java.util.Scanner;

public class JA0905_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int x = (int)(Math.random()*10)+1;
		
		for(int i=0;i<3;i++) {
			//숫자를 입력받아 랜덤숫자를 맞추는 프로그램
			System.out.println("숫자를 입력하세요");
			int num = scan.nextInt();
			//숫자 비교
			if(x==num) {
				System.out.println("정답입니다.");
				break; //반복문을 중간에 종료하는 명령어
				
			}else {
				System.out.println("오답입니다.");
			}
		}
		
		
		
		//정답
		System.out.println("랜덤숫자는 : " + x);

	}

}
