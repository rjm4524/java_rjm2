package p0904;

import java.util.Scanner;

public class JA0904_07 {

	public static void main(String[] args) {
		//1부터 10까지의 랜덤숫자를 생성후 출력하시오. 1개만 출력
	Scanner scan = new Scanner(System.in);
		int random = (int)(Math.random()*10)+1;
		int num1=0,num2=0,num3=0;
		
		//1번째
		System.out.println("1번째 숫자를 입력하세요.");
		num1 = scan.nextInt();
		
		
		
		if(random==num1) {
			System.out.println("정답입니다.");
		}else {
			System.out.println("오답입니다.");
		}
		
		//2번째
		System.out.println("2번째 숫자를 입력하세요.");
		num2= scan.nextInt();
		if(random==num2) {
			System.out.println("정답입니다.");
		}else {
			System.out.println("오답입니다.");
		}
		
		//3번째
		System.out.println("3번째 숫자를 입력하세요.");
		num3 = scan.nextInt();
		if(random==num3) {
			System.out.println("정답입니다.");
		}else {
			System.out.println("오답입니다.");
		}
		System.out.printf("입력한 숫자 : %d,%d,%d \n" ,num1,num2,num3);
		

	
	
	//3개의 숫자를 입력받아, 정답을 맞추는 프로그램을 구현하시오.
	//1개 입력받은 후 맞는지 확인 정답,오답
	//3개의 입력값을 출력
	System.out.println("정답번호:" + random );
		
		
		
		
		
		
		
		
		
		
		// 랜덤숫자 1-100까지 5개의 랜덤 숫자를 생성해서 변수에 저장후 출력하시오. 숫자 중복 가능
	
		
//		int num = (int)(Math.random()*100)+1;
//		int num1 = (int)(Math.random()*100)+1;
//		int num2 = (int)(Math.random()*100)+1;
//		int num3 = (int)(Math.random()*100)+1;
//		int num4 = (int)(Math.random()*100)+1;
//		
//		System.out.printf("%d,%d,%d,%d,%d",num, num1,num2,num3,num4);
		
	}//main

}//class
