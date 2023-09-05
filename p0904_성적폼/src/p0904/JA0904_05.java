package p0904;

import java.util.Scanner;

public class JA0904_05 {

	public static void main(String[] args) {
		// 10,5 두수를 입력받아, 큰수를 출력하시오
		
		//두수를 입력
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요.");
		int num1 = scan.nextInt();
		System.out.println("두번째 숫자를 입력하세요.");
		int num2 = scan.nextInt();
		
		//두수를 비교
		if(num1>num2) {
			System.out.println("큰수 : " + num1);
			System.out.println("작은수 :" + num2);
		}else if(num2>num1) {
			System.out.println("큰수 :" + num2);
			System.out.println("작은수 : " + num1);
		}else {
			System.out.println("두수가 같습니다.");
		}
		
		//두수를 출력
		System.out.printf("입력한 숫자 : %d,%d \n" ,num1,num2);

	}

}
