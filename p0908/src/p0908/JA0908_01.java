package p0908;

import java.util.Scanner;

public class JA0908_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//선언
		int [] lotto = new int [45];
		int [] Num = new int [6];
		int [] winNum = new int [6];
		int temp = 0;
		int count = 0;
		
		//2. 번호나열
		
		for(int i=0; i<45; i++) {
			lotto[i] = i+1;
		}
		
		//3.번호 섞기
		
		for(int i=0; i<300; i++) {
			int random = (int)(Math.random()*45);
			lotto[0] = lotto[random];
			lotto[random] = temp;
			temp = lotto[0];
			
		}
		
		//4.내번호 입력하기
		
		for (int i=0; i<6;i++) {
			System.out.printf("%d번째 번호를 입력하세요.",(i+1));
			Num[i] = scan.nextInt();
		}
		
		//5.로또번호 추출
		
		for(int i=0;i<6;i++) {
			winNum[i] = lotto[i];
			
		}
		
		System.out.println("당첨번호 :");
		for(int i=0;i<6;i++) {
			System.out.print("" +winNum[i]);
		}
		
		
		
	}

}
